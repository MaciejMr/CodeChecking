package pl.sdaacademy.codecheck;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\MM\\Desktop\\SDA\\check_code\\src\\main\\resources\\Text.txt";
        FileReader fileReader = new FileReader(fileName);

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String oneLine;
            while((oneLine = bufferedReader.readLine()) != null) {
                System.out.println(oneLine);
                System.out.println(new CodeCheck().checkParenthesis(oneLine));
            };
        }
    }
}