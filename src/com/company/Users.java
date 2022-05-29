/*
 * @created 28/052022 - 19:15
 * @project Car-Rental_Project
 * @author Johnny Carvalho
 */

package com.company;

public class Users extends Register {

    private Integer birthDate, numberPhone, numberHome, zipCode;
    private String email, street, city;

    public Users() {
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
}
