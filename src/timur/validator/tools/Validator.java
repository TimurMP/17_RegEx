package timur.validator.tools;

public class Validator {
    public static boolean checkCreditCard(String str) {
        String pattern = "\\d{8,16}";
        return str.matches(pattern);
    }

    public static boolean checkDateFormatEU(String str) {
        //Format: DD.MM.YYYY
        String pattern = "([0-3][0-1]|[0-2][0-9])\\.([0-1][0-2]|0[0-9])\\.([1-2][0-9]{3})";
        return str.matches(pattern);
    }

    public static boolean checkDateFormatUS(String str) {
        //
        //Format: YYYY-MM-DD
        String pattern = "([1-2][0-9]{3})-([0-1][0-2]|0[0-9])-([0-3][0-1]|[0-2][0-9])";
        return str.matches(pattern);
    }

    public static boolean checkPhoneNumber(String str) {
        //Format: +99(99)9999-9999
        String pattern = "\\+(\\d{2})\\((\\d{2})\\)(\\d{4})-(\\d{4})";
        return str.matches(pattern);
    }

    public static boolean checkLessEquals255(String str) {
        String pattern = "(\\d{1,2})|(1\\d\\d)|(2[0-4]\\d)|(25[0-5])";
        return str.matches(pattern);
    }

}
