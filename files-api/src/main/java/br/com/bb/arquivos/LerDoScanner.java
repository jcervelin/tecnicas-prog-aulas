package br.com.bb.arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerDoScanner {


    private static String HOME = System.getProperty("user.home");
    private static String HOME_DIR = System.getProperty("user.dir");

    public static void main(String[] args) {

        String path = HOME_DIR + "/files-api/src/main/resources/xanadu.txt";

        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
