
package com.mycompany.poe1;

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
}
