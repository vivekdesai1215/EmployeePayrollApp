package com.validator;

import com.validator.InvalidDataException;

public class PasswordValidator {

    public static void validatePassword(String password) throws InvalidDataException {
        int length = password.length();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }

        // Rules with exceptions
        if (length < 8) {
            throw new InvalidDataException("Password must be at least 8 characters long.");
        }
        if (!hasUpper) {
            throw new InvalidDataException("Password must contain at least one uppercase letter.");
        }
        if (!hasLower) {
            throw new InvalidDataException("Password must contain at least one lowercase letter.");
        }
        if (!hasDigit) {
            throw new InvalidDataException("Password must contain at least one digit.");
        }
        if (!hasSpecial) {
            throw new InvalidDataException("Password must contain at least one special character.");
        }
    }
}
