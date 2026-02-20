/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vucourses;

import java.util.Scanner;

/**
 *
 * @author NUWA
 */
public class VUCourses {
    public static void main(String[] args) {

        // Declare variables for module details
        String moduleCode;
        String programmeName;
        int tuitionFees;

        // Display welcome message
        try ( // Create Scanner object to read user input
                Scanner scanner = new Scanner(System.in)) {
            // Display welcome message
            System.out.println("=====================================================");
            System.out.println("   WELCOME TO VICTORIA UNIVERSITY KAMPALA - VUPay   ");
            System.out.println("=====================================================");
            System.out.println();
            System.out.println("Available Module Codes:");
            System.out.println("  BSF - BSc Software Engineering");
            System.out.println("  BIT - BSc Information Technology");
            System.out.println("  BCS - BSc Computer Science");
            System.out.println("  BCE - BSc Computer Engineering");
            System.out.println();
            // Prompt the applicant to enter the Module Code
            System.out.print("Enter the Module Code: ");
            moduleCode = scanner.nextLine().trim().toUpperCase();
            // Use switch statement to return course details based on Module Code
            switch (moduleCode) {
                case "BSF":
                    programmeName = "BSc Software Engineering";
                    tuitionFees = 900000;
                    System.out.println();
                    System.out.println("---------------------------------------------");
                    System.out.println("         COURSE DETAILS FOUND                ");
                    System.out.println("---------------------------------------------");
                    System.out.println("Module Code      : " + moduleCode);
                    System.out.println("Programme Name   : " + programmeName);
                    System.out.println("Tuition Fees     : UGX " + String.format("%,d", tuitionFees));
                    System.out.println("---------------------------------------------");
                    break;
                case "BIT":
                    programmeName = "BSc Information Technology";
                    tuitionFees = 750000;
                    System.out.println();
                    System.out.println("---------------------------------------------");
                    System.out.println("         COURSE DETAILS FOUND                ");
                    System.out.println("---------------------------------------------");
                    System.out.println("Module Code      : " + moduleCode);
                    System.out.println("Programme Name   : " + programmeName);
                    System.out.println("Tuition Fees     : UGX " + String.format("%,d", tuitionFees));
                    System.out.println("---------------------------------------------");
                    break;
                case "BCS":
                    programmeName = "BSc Computer Science";
                    tuitionFees = 800000;
                    System.out.println();
                    System.out.println("---------------------------------------------");
                    System.out.println("         COURSE DETAILS FOUND                ");
                    System.out.println("---------------------------------------------");
                    System.out.println("Module Code      : " + moduleCode);
                    System.out.println("Programme Name   : " + programmeName);
                    System.out.println("Tuition Fees     : UGX " + String.format("%,d", tuitionFees));
                    System.out.println("---------------------------------------------");
                    break;
                case "BCE":
                    programmeName = "BSc Computer Engineering";
                    tuitionFees = 950000;
                    System.out.println();
                    System.out.println("---------------------------------------------");
                    System.out.println("         COURSE DETAILS FOUND                ");
                    System.out.println("---------------------------------------------");
                    System.out.println("Module Code      : " + moduleCode);
                    System.out.println("Programme Name   : " + programmeName);
                    System.out.println("Tuition Fees     : UGX " + String.format("%,d", tuitionFees));
                    System.out.println("---------------------------------------------");
                    break;
                default:
                    System.out.println();
                    System.out.println("Wrong Module Code details");
                    break;
            }
            // Close the scanner
        }
    }
}
