package com.csvparser;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class CSVParser<T> {

    private static final String SEPARATOR = ",";
    private static final Charset ENCODING = StandardCharsets.UTF_8;
    int dummyCounter = 0;
    private List<String> headers = new ArrayList<>();

    public CSVParser() {

    }

    public byte[] createByteArray(List<T> dataList){

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            //this.writeHeaderToStream(dataList, bos);
            this.writeListToStream(dataList, bos);
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        return bos.toByteArray();
    }

    public void writeListToStream(List<T> list, OutputStream stream) throws IOException {

        for(T data : list){
            writeDataToStream(data, stream);
        }

    }

    public void writeDataToStream(T data, OutputStream stream) throws IOException {

        HashMap<Integer, Field> fields = getAnnotatedFields(data.getClass());
        //Man braucht den Index damit man nach der Reihenfolge schreiben kann
        writeFields(stream, data, fields, 0);
        this.write("\n", stream);
    }

    //Parameter in getAnnotatedFields; kann jede Klasse aufnehmen. YAAS!!!
    private HashMap<Integer, Field> getAnnotatedFields(Class<? extends Object> dataClass){

        HashMap<Integer, Field> fields = new HashMap<>();

        for(Field field : dataClass.getDeclaredFields()){
            if(field.isAnnotationPresent(CSVField.class)){
                CSVField annotation = field.getAnnotation(CSVField.class);
                int fieldIndex = annotation.value();
                headers.add(field.getName());

                fields.put(fieldIndex, field);
            }
        }
        return fields;
    }
    /**
     * TODO: In eigenen Worten - Pruefe ob value = 0 ist, wenn ja hau einen leeren String an die Stelle, sonst
     * TODO: mach value zu einem String und hol die Bytes (weil du in ein ByteArray schreibst)
     *
     * @param value
     * @param stream
     * @throws IOException
     */
    private void write(Object value, OutputStream stream) throws IOException {
        stream.write(value == null ? "".getBytes(ENCODING) : value.toString().getBytes(ENCODING));
    }

    private void writeFields(OutputStream stream, T data, HashMap<Integer, Field> fieldsToWrite, int startIndex) throws IOException{

        if(dummyCounter == 0){
            this.write(headers.toString(), stream);
            this.write("\n", stream);
            dummyCounter++;
        }

        for(int i = startIndex; i <= fieldsToWrite.size(); i++){
            Field field = fieldsToWrite.get(i);

            if(field == null){
                continue;
            }
            field.setAccessible(true);

            try {
                Object fieldValue = field.get(data);

                if(field.isAnnotationPresent(CSVEntity.class)){

                    CSVEntity transform = field.getAnnotation(CSVEntity.class);
                    //TODO: Es funktioniert weil CSVEntity nie benutzt wird, einfach rausnehmen. Anders loesen.
                    //Transform t = fieldAnnotation.value().getConstructor(CSVField.class).newInstance();
                    Transform t = (Transform) transform.getClass().getConstructor(CSVEntity.class).newInstance();
                    //Macht aus Object einen String
                    fieldValue = t.transform(fieldValue);

                }

                //TODO: CSV Konformitaet. Im header keine Klammern, keine schlusskommas
                this.write(fieldValue, stream);
                this.write(SEPARATOR, stream);
            } catch (IllegalAccessException | NoSuchMethodException e) {
                System.out.println(e.toString());
            } catch (InvocationTargetException e) {
                System.out.println(e.toString());
            } catch (InstantiationException e) {
                System.out.println(e.toString());
            }
        }
    }
}
