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
        assertFalse(Validator.checkDateFormatEU("00.01.2018"));
        assertFalse(Validator.checkDateFormatEU("01.00.2018"));
        assertFalse(Validator.checkDateFormatEU("01.00.0000"));



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
        //Format: +99(99)9999-9999
        assertTrue(Validator.checkPhoneNumber("+99(99)9999-9999"));
        assertTrue(Validator.checkPhoneNumber("+97(25)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+97(25)a234-5678"));
        assertFalse(Validator.checkPhoneNumber("+97(25)1234.5678"));
        assertFalse(Validator.checkPhoneNumber("+972512345678"));
        assertFalse(Validator.checkPhoneNumber("+97251234-5678"));


    }

    @Test
    void checkLessEquals255() {
        assertTrue(Validator.checkLessEquals255("255"));
        assertTrue(Validator.checkLessEquals255("199"));
        assertTrue(Validator.checkLessEquals255("100"));
        assertTrue(Validator.checkLessEquals255("99"));
        assertTrue(Validator.checkLessEquals255("9"));
        assertTrue(Validator.checkLessEquals255("0"));
        assertFalse(Validator.checkLessEquals255("256"));
        assertFalse(Validator.checkLessEquals255("333"));
        assertFalse(Validator.checkLessEquals255("25a"));
        assertFalse(Validator.checkLessEquals255("(255)"));








    }
}