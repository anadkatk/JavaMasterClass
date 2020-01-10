package com.Car;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static String readFile() throws IOException {
        FileReader sourceStream = null;
        try{
            sourceStream = new FileReader("Cardata.txt");
            int temp;
            String lineFromFile = "";
            while((temp = sourceStream.read()) != -1){
                //System.out.print((char)temp);
                lineFromFile = lineFromFile + (char)temp;
            }

            return (lineFromFile);
        }
        catch (Exception e){
            return ("There was an exception caused in reading the file.");
        }
        finally {
            if(sourceStream !=null){
                sourceStream.close();
            }
        }

    }

}
