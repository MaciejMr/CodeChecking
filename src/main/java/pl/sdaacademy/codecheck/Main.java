package pl.sdaacademy.codecheck;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] pArgs) throws IOException {
        String fileName = "C:\\Users\\MM\\Desktop\\SDA\\check_code\\src\\main\\resources\\Text.txt";
        File file = new File(fileName);

        try (Stream linesStream = Files.lines(file.toPath())) {
            System.out.println(linesStream);
            linesStream.forEach(line -> {
                System.out.println(line);
            });
        }
    }
}