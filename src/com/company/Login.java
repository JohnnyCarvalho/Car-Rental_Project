package com.company;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        // Create a variable for umputting data
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o nome do usuário: ");
        String inputName = input.next();input.nextLine();

        Register name = new Register();

        name.setName(inputName);

    }
}
