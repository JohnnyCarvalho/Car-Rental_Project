/*
 * @created 28/052022 - 18:48
 * @project Car-Rental_Project
 * @author Johnny Carvalho
 *
 * Nessa classe usaremos um método de designer patterns chamado "template mathod",
 * esse método nada mais é, do que a reaproveitação de código comum em outras classes.
 *
 */

package com.company;

public class Register {

    private Integer ID;
    private String name;
    private Integer numberDocument;


    public Register() {

    }



    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(Integer numberDocument) {
        this.numberDocument = numberDocument;
    }
}
