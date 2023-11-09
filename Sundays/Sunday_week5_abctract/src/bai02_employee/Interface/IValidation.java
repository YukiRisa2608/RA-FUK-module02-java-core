package bai02_employee.Interface;

public interface IValidation{
    boolean isValidDateOfBirth(String date);
    boolean isValidEmail(String email);
    boolean isValidName(String name);
    boolean isValidPhoneNumber(String phoneNumber);
}
