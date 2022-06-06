package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static ArrayList<Register> newRegister;
    //public static ArrayList<Cars> listCar;

    public static void main(String[] args) {
        // Create a variable for update writing color in command prompt
        String color = "\u001B[";

        Cars newCars = new Cars();
        Users newUsers = new Users();

        // Create a variable for inputting data
        Scanner input = new Scanner(System.in);

        System.out.println(color+"31"+"m"+"*** REGISTER PAGE ***"+color+"m");

        System.out.println("Oque deseja registrar?");

        System.out.print("\nDigite 1 para carro e 2 para usuário");
        Integer register = input.nextInt();input.nextLine();


        if (register == 1) {

            ArrayList<Cars> listCar = new ArrayList<Cars>();

            System.out.println("Quantos veículos deseja cadastrar?");
            Integer contadorCar = input.nextInt();input.nextLine();

            for (int i = 0; i < contadorCar; i++) {
                System.out.println(color + "32" + "m" + "DIGITE OS DADOS DO " + (i + 1) + "º" + " VEÍCULO" + color + "m");

                System.out.print("Código: ");
                newCars.setID(input.nextInt());
                input.nextLine();

                System.out.print("Marca: ");
                newCars.setName(input.nextLine());

                System.out.print("Documento: ");
                newCars.setNumberDocument(input.nextLine());

                System.out.print("Modelo: ");
                newCars.setCarBrand(input.nextLine());

                System.out.print("Digite o ano/modelo do carro: ");
                newCars.setModelYear(input.nextInt());
                input.nextLine();

                Cars objCar = new Cars(newCars.getID(), newCars.getName(),
                        newCars.getNumberDocument(), newCars.getModelYear(), newCars.getCarBrand());

                listCar.add(objCar);

            }

        }
        else if (register == 2) {

            System.out.println(color+"35"+"m"+"DIGITE OS DADOS DO USUÁRIO"+color+"m");

            System.out.print("Id usuário (somente números): ");
            newUsers.setID(input.nextInt());input.nextLine();

            System.out.print("CPF: ");
            newUsers.setNumberDocument(input.nextLine());

            System.out.print("Nome completo: ");
            newUsers.setName(input.nextLine());

            System.out.print("E-mail: ");
            newUsers.setEmail(input.nextLine());

            System.out.print("Telefone: ");
            newUsers.setNumberPhone(input.nextInt());input.nextLine();

            System.out.print("Rua: ");
            newUsers.setStreet(input.nextLine());

            System.out.print("Nº da residência: ");
            newUsers.setNumberHome(input.nextInt());input.nextLine();

            System.out.print("Cidade: ");
            newUsers.setCity(input.nextLine());

            System.out.print("CEP: ");
            newUsers.setZipCode(input.nextInt());input.nextLine();

            System.out.print("Ano nascimento: ");
            newUsers.setBirthDate(input.nextInt());input.nextLine();
        }
    }
}
