package org.itstep.task06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class Main {
    public static void main(String[] args) throws IOException {
        XmlReader[] array = new XmlReader[10];
        for (int i = 0; i < args.length; i++){
            array[i] = new XmlReader();
        }
        Main.readXml(array);
    }

    public static void readXml(XmlReader[] xmlReaders) throws IOException {
        for (XmlReader reader : xmlReaders){
            try{
                reader.read();
            } catch (FileSystemAlreadyExistsException e) {
                throw new FileNotFoundException();
            } catch (NullPointerException e){
                System.out.println("NPE!");
            }
        }
    }
}
