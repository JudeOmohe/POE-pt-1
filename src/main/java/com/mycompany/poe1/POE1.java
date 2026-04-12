
package com.mycompany.poe1;

import static com.mycompany.poe1.NewClass.Password;
import static com.mycompany.poe1.NewClass.Phone;
import static com.mycompany.poe1.NewClass.Username;
import java.util.Scanner;

public class POE1 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
  
        
        System.out.println("=== ACCOUNT REGISTRATION ===");
        
        System.out.println("\nEnter first name:");
        String firstName = input.nextLine();
        System.out.println("\nEnter last name: ");
        String lastName = input.nextLine();
    
    // 1. Loop for Username
        String username = "";
        while (true) {
            System.out.print("\nCreate Username: ");
            username = input.nextLine();
            if (Username(username)) break;
        }
        // 2. Loop for Password
        String password = "";
        while (true) {
            System.out.print("Create Password: ");
            password = input.nextLine();
            if (Password(password)) break;
        }
        // 3. Loop for Phone Number
        String phone = "";
        while (true) {
            System.out.print("Enter Cell Phone with country code: ");
            phone = input.nextLine();
            if (Phone(phone)) break;
        }
         System.out.println("REGRISTERATION WAS SUCCESSFUL");
        
       
        System.out.println("\n--- LOGIN TO YOUR ACCOUNT ---");
        
        // === LOGIN SECTION ===
        String loginUser = "";
        String loginPass = "";
        boolean loggedIn = false;

        while (!loggedIn) {
        System.out.print("Enter Username: ");
        loginUser = input.nextLine();
        System.out.print("Enter Password: ");
        loginPass = input.nextLine();

        // Check if entered credentials match what was registered
        if (loginUser.equals(username) && loginPass.equals(password)) {
        loggedIn = true;
        } else {
        System.out.println("Incorrect username or password. Please try again.");
        }
    }
            
           
    }
}
        
        

