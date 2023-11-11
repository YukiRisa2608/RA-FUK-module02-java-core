package bai02_employee.Implement;

import java.util.regex.Pattern;

public class ValidationLogic {
    public static boolean isValidName(String name) {
        String namePattern = "^[a-zA-Z]+([\\s'-][a-zA-Z]+)*$";
        return Pattern.matches(namePattern, name);
    }

    public static boolean isValidDateOfBirth(String dateOfBirth) {
        //YYYY-MM-DD
        String datePattern = "\\d{4}-\\d{2}-\\d{2}";
        return Pattern.matches(datePattern, dateOfBirth);
    }

    public static boolean isValidEmail(String email) {
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.matches(emailPattern, email);
    }

    //10 chữ số liên tiếp không có ký tự đặc biệ
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String phonePattern = "^\\d{10}$";
        return Pattern.matches(phonePattern, phoneNumber);
    }
}
