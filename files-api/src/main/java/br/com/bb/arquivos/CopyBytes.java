package br.com.bb.arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {

        try (FileInputStream in = new FileInputStream("/Users/juliano.cervelin/IdeaProjects/letscode/tecnicas-prog/files-api/src/main/resources/xanadu.txt");
             FileOutputStream out = new FileOutputStream("/Users/juliano.cervelin/IdeaProjects/letscode/tecnicas-prog/files-api/src/main/resources/outagain.txt")) {

            int c;
            in.readAllBytes();
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
