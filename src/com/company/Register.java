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

import java.util.ArrayList;

public class Register {

    private Integer ID;
    private String name, numberDocument;
    public ArrayList list = new ArrayList();

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

    public String getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberDocument = numberDocument;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    public void saidaDeDados () {
        System.out.println("*** SEGUE A LISTA CADSTRADA ***");
        System.out.println("ID: "+getID());
        System.out.println("Name: "+getName());
        System.out.println("Document: "+getNumberDocument());
    }
}
