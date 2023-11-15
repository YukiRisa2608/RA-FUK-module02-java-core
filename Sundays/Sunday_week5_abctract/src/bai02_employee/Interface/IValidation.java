package bai02_employee.Interface;

public interface IValidation{
    boolean isValidName(String name);
    boolean isValidDate(String date);
    boolean isValidEmail(String email);
    boolean isValidPhoneNumber(String phoneNumber);
}
