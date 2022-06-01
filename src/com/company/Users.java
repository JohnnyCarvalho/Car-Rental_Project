/*
 * @created 28/052022 - 19:15
 * @project Car-Rental_Project
 * @author Johnny Carvalho
 */

package com.company;

import java.util.ArrayList;

public class Users extends Register {

    private Integer birthDate, numberPhone, numberHome, zipCode;
    private String email, street, city;
    ArrayList listUser = new ArrayList();

    public Users() {
    }

    public Users(Integer birthDate, Integer numberPhone, Integer numberHome, Integer zipCode, String email, String street, String city) {
        this.birthDate = birthDate;
        this.numberPhone = numberPhone;
        this.numberHome = numberHome;
        this.zipCode = zipCode;
        this.email = email;
        this.street = street;
        this.city = city;
    }

    @Override
    public Integer getID() {
        return super.getID();
    }

    @Override
    public void setID(Integer ID) {
        super.setID(ID);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Integer getNumberDocument() {
        return super.getNumberDocument();
    }

    @Override
    public void setNumberDocument(Integer numberDocument) {
        super.setNumberDocument(numberDocument);
    }

    public Integer getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Integer birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(Integer numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getNumberHome() {
        return numberHome;
    }

    public void setNumberHome(Integer numberHome) {
        this.numberHome = numberHome;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public ArrayList getListUser() {
        return listUser;
    }

    public void setListUser(ArrayList listUser) {
        this.listUser = listUser;

    }

    public void saidaDeDados() {
        System.out.println("*** DADOS DE USUÁRIOS ***");
        super.saidaDeDados();
        System.out.println("E-mail: "+getEmail());
        System.out.println("Nascimento: "+getBirthDate());
        System.out.println("Celular: "+getNumberPhone());
        System.out.println("ENDEREÇO");
        System.out.println("Rua: "+getStreet());
        System.out.println("Nº residência: "+getNumberHome());
        System.out.println("Cidade: "+getCity());
    }
}
