package pl.sdaacademy.codecheck;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CodeCheck {
    public String checkCode (String string) {
        String[] splittedWord = string.split(" ");

        return Arrays.stream(splittedWord)
                .filter(word -> !word.isEmpty())
                .collect(Collectors.joining());
    }
}
