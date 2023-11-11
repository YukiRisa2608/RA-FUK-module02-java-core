package bai02_employee.Interface;

public interface IValidation{
    boolean isValidName(String name);
    boolean isValidDateOfBirth(String dateOfBirth);
    boolean isValidEmail(String email);
    boolean isValidPhoneNumber(String phoneNumber);
}
