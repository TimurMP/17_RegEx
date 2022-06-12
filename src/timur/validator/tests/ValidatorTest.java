package timur.validator.tests;

import org.junit.jupiter.api.Test;
import timur.validator.tools.Validator;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void checkCreditCard() {
        assertTrue(Validator.checkCreditCard("12345678"));
        assertTrue(Validator.checkCreditCard("1234567890"));
        assertTrue(Validator.checkCreditCard("1234567890987654"));
        assertFalse(Validator.checkCreditCard("12345678909876541234567890987654"));
        assertFalse(Validator.checkCreditCard("123456aasddss545"));


    }

    @Test
    void checkDateFormatEU() {
        //Format: DD.MM.YYYY
        assertTrue(Validator.checkDateFormatEU("16.02.1988"));
        assertTrue(Validator.checkDateFormatEU("01.01.2001"));
        assertTrue(Validator.checkDateFormatEU("12.12.2999"));
        assertFalse(Validator.checkDateFormatEU("00.00.0000"));
        assertFalse(Validator.checkDateFormatEU("32.03.1995"));
        assertFalse(Validator.checkDateFormatEU("11.15.2021"));
        assertFalse(Validator.checkDateFormatEU("03.03.3033"));
        assertFalse(Validator.checkDateFormatEU("01-01-2001"));
    }

    @Test
    void checkDateFormatUS() {
        //Format: YYYY-MM-DD
        assertTrue(Validator.checkDateFormatUS("1999-11-02"));
        assertTrue(Validator.checkDateFormatUS("2022-06-13"));
        assertTrue(Validator.checkDateFormatUS("2038-06-25"));
        assertFalse(Validator.checkDateFormatUS("3333-06-25"));
        assertFalse(Validator.checkDateFormatUS("3333-06-25-25"));
        assertFalse(Validator.checkDateFormatUS("1999.06.25"));
        assertFalse(Validator.checkDateFormatUS("2038-15-25"));
        assertFalse(Validator.checkDateFormatUS("2038-11-48"));


    }

    @Test
    void checkPhoneNumber() {
    }

    @Test
    void checkLessEquals255() {
    }
}