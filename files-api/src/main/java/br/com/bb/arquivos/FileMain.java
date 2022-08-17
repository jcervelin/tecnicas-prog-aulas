package br.com.bb.arquivos;

import java.io.File;

public class FileMain {
    private static String HOME_DIR = System.getProperty("user.dir");

    public static void main(String[] args) {
        final File file = new File(HOME_DIR + "/" + "Gustavo.txt");

        if (file.isFile()) {
            System.out.println("é um arquivo");
        }

    }
}
