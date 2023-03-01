package filehandling;

import java.io.*;

public class SequentialStreamDemo {
    public static void main(String[] args) {

        //for read
        try {
            FileInputStream fileInputStream =new FileInputStream("sample1.txt");
            FileInputStream fileInputStream1 =new FileInputStream("sample3.txt");
            SequenceInputStream sequenceInputStream=new SequenceInputStream(fileInputStream1,fileInputStream);

            int i=sequenceInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i= sequenceInputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //for write we use byteArryaoutputSteream

        try{
            FileOutputStream fileOutputStream=new FileOutputStream("vhhb.txt");
            FileOutputStream fileOutputStream1=new FileOutputStream("jsxhiuds.txt");
            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();

            byteArrayOutputStream.write("1223".getBytes());

            byteArrayOutputStream.writeTo(fileOutputStream);
            byteArrayOutputStream.writeTo(fileOutputStream1);

        }catch (IOException e){
            e.printStackTrace();
        }


    }



}
