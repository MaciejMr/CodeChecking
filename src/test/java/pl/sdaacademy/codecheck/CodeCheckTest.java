package pl.sdaacademy.codecheck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeCheckTest {

    @Test
    void checkCode() {
        //given
        String codeLine = "[ tak ( ] nie ) jest dobrze";
        //when
        String codeCheck = new CodeCheck().checkParenthesis(codeLine);
        //then
        assertEquals(codeCheck, "niepoprawnie");
    }
}