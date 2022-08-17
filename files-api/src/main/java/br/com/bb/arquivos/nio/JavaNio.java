package br.com.bb.arquivos.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaNio {

    private static String HOME = System.getProperty("user.home");
    private static String DIR = System.getProperty("user.dir");

    public static void main(String[] args) throws IOException {

        System.out.println(HOME);
        System.out.println(DIR);
        Path p = Paths.get(DIR + "/files-api/texto789.txt");
        System.out.println(Files.exists(p));
        System.out.println(p.getFileName());
        final Stream<String> collect = Files.lines(p);
        System.out.println(collect);

        System.out.println(HOME);
        System.out.println(DIR);
        Path folder1 = Paths.get(DIR + "/files-api");
        Path folder2 = Paths.get(DIR + "/files-api");
        System.out.println("isSameFile " + Files.isSameFile(folder1, folder2));
        System.out.println("isRegularFile " + Files.isRegularFile(folder1));
        System.out.println("isDirectory " + Files.isDirectory(folder1));

        String caminhoNovoArquivo = DIR + "/meuNovoDiretorio";
        String caminhoDegrau = DIR + "/degrau";

        final Path pathNovoArquivo = Paths.get(caminhoNovoArquivo);

        final Path pathDegrau = Paths.get(caminhoDegrau);
        System.out.println("Arquivo existe antes da criacao? " + Files.exists(pathNovoArquivo));

        Files.createDirectory(pathNovoArquivo);
        Files.createDirectory(pathDegrau);

        Path file1 = pathNovoArquivo.resolve("arquivo1.txt");
        Path file2 = pathDegrau.resolve("arquivo2.txt");

        Files.createFile(file1);
        Files.createFile(file2);

        // Nao funciona
        Files.move(file1, file2, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("Arquivo existe depois da criacao? " + Files.exists(pathNovoArquivo));

    }
}
