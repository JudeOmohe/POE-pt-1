
package com.mycompany.poe1;

import static com.mycompany.poe1.NewClass.LoginUser;
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
        String user = "";
        String pass = "";
       

        while (true) {
            System.out.print("Enter Username: ");
            user = input.nextLine();
            System.out.print("Enter Password: ");
            pass = input.nextLine();
            if (LoginUser(user, pass, username, password)) break;

        
    }
        NewClass named = new NewClass(firstName, lastName);
        
        named.Names();
        
        System.out.println("All credentials captured correctly!");
           
    }
}
        
        

