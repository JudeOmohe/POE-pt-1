
package com.mycompany.poe1;

import java.util.regex.Pattern;

public class NewClass {
    private String firstName;
    private String lastName;
    
    
    public NewClass(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public static boolean Username(String user) {
        if (user.contains("_") && user.length() <= 5) {
            System.out.println("Username successfully captured.");
            return true;
        }
        System.out.println("Username incorrectly formatted; must contain '_' and be max 5 chars.");
        return false;
    }
    public static boolean Password(String password) {
        // Regex: 8+ chars, 1+ Upper, 1+ Digit, 1+ Special
        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[\\W_]).{8,}$";
        if (Pattern.matches(passwordRegex, password)) {
            System.out.println("Password successfully captured.");
            return true;
        }   
        System.out.println("Password is not correctly formatted; must be 8+ chars with a capital, number, and symbol.");
        return false;
    }
}
