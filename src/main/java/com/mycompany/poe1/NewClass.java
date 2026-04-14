
package com.mycompany.poe1;

import java.util.regex.Pattern;

public class NewClass {
    private String firstName;
    private String lastName;
    
    // Creates a new user with a first name and last name 
    public NewClass(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // Checks if the username contains '_' and is 5 characters or less
    public static boolean Username(String user) {
        if (user.contains("_") && user.length() <= 5) {
            System.out.println("Username successfully captured.");
            return true;
        }
        System.out.println("Username incorrectly formatted");
        return false;
    }
    // Checks if the password has 8+ chars, a capital letter, a number, and a symbol
    public static boolean Password(String password) {
        // Regex: 8+ chars, 1+ Upper, 1+ Digit, 1+ Special
        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[\\W_]).{8,}$";
        if (Pattern.matches(passwordRegex, password)) {
            System.out.println("Password successfully captured.");
            return true;
        }   
        System.out.println("Password is not correctly formatted.");
        return false;
    }
    // Checks if the phone number starts with '+' and contains only digits
    public static boolean Phone(String phone) {
        // Regex: Starts with +, followed by 1 to 10+ digits
        String phoneRegex = "^\\+[0-9]{1,20}$";
        if (Pattern.matches(phoneRegex, phone)) {
            System.out.println("Cell phone number successfully added.");
            return true;
        }
        System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
        return false;
    }
    //Registers a user if the username and password are both valid
    public static String[] registerUser(String username, String password) {
        if (!Username(username)) {
            System.out.println("Registration failed: Username is incorrectly formatted.");
            return null;
        }
        if (!Password(password)) {
            System.out.println("Registration failed: Password does not meet the complexity requirements.");
            return null;
        }
        System.out.println("Registration successful! Username and password meet all requirements.");
        return new String[]{username, password};
    
    }
    // Logs in a user if the entered credentials match the registered ones
    public static boolean loginUser(String User, String Password, String[] registeredCredentials) {
        if (registeredCredentials == null) {
            System.out.println("Login failed: No registered account found. Please register first.");
            return false;
        }
        String registeredUsername = registeredCredentials[0];
        String registeredPassword = registeredCredentials[1];
 
        if (User.equals(registeredUsername) && Password.equals(registeredPassword)) {
            System.out.println("Login was successful.");
            return true;
        }
        System.out.println("Login failed. Incorrect username or password. Please try again.");
        return false;
    }
 
    // Prints a welcome message with the user's full name
    public void Names(){
        System.out.println("Welcome " + firstName + " " + lastName + " great to see you ");
    }
}
