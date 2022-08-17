package br.com.bb.arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderMain {

    private static String HOME_DIR = System.getProperty("user.dir");


    public static void main(String[] args) {
        final File file = new File(HOME_DIR + "/files-api/src/main/resources/national-charge-point-registry-with-success.csv");
        BufferReaderMain main = new BufferReaderMain();
        main.lerEmBufferReader(file);
    }


    public void lerEmBufferReader(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
