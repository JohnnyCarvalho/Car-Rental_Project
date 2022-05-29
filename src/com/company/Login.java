package com.company;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        // Create a variable for update writing color in command prompt
        String color = "\u001B[";

        Cars newCars = new Cars();
        Users newUsers = new Users();

        // Create a variable for umputting data
        Scanner input = new Scanner(System.in);

        System.out.print(color+"31"+"m"+"*** REGISTER PAGE ***"+color+"m");

        System.out.println("What do you wnat to register?");

        System.out.print("Write 1 for car or 2 for user");
        Integer register = input.nextInt();input.nextLine();




        if (register == 1) {
            System.out.print("Enter your ID: ");
            newCars.setID(input.nextInt());input.nextLine();

            System.out.print("Enter with the document number car: ");
            newCars.setNumberDocument(input.nextInt());input.nextLine();

            System.out.print("Enter your car name: ");
            newCars.setName(input.nextLine());

            System.out.print("Enter your car brand: ");
            newCars.setCarBrand(input.nextLine());

            System.out.println("Enter with model/year car");
            newCars.setModelYear(input.nextInt());input.nextLine();

        }
        else if (register == 2) {
            
        }
    }
}
