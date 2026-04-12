
package com.mycompany.poe1;

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
    }
}
        
        

