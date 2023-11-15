package bai02_employee.Implement;

import bai02_employee.Interface.IValidation;

import java.util.regex.Pattern;

public class ImplementValidation implements IValidation {

    @Override
    public boolean isValidName(String name) {
        return ValidationLogic.isValidName(name);
    }

    @Override
    public boolean isValidDate(String date) {
        return ValidationLogic.isValidDate(date);
    }

    @Override
    public boolean isValidEmail(String email) {
        return ValidationLogic.isValidEmail(email);
    }

    @Override
    public boolean isValidPhoneNumber(String phoneNumber) {
        return ValidationLogic.isValidPhoneNumber(phoneNumber);
    }
}
