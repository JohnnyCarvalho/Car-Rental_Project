/*
 * @created 28/052022 - 19:15
 * @project Car-Rental_Project
 * @author Johnny Carvalho
 */

package com.company;

import java.util.ArrayList;

public class Cars extends Register {

    private Integer modelYear;
    private String carBrand;
    ArrayList list = new ArrayList();

    public Cars() {}

    public Cars(Integer getId, String getName, String getNumberDocument, Integer modelYear, String carBrand) {
        super.getID();
        super.getName();
        super.getNumberDocument();
        this.modelYear = modelYear;
        this.carBrand = carBrand;

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
    public String getNumberDocument() {
        return super.getNumberDocument();
    }

    @Override
    public void setNumberDocument(String numberDocument) {
        super.setNumberDocument(numberDocument);
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }


    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    @Override
    public ArrayList getList() {
        return list;
    }

    @Override
    public void setList(ArrayList list) {
        this.list = list;
    }

    public void saidaDeDados () {
        System.out.println("*** DADOS DO VEÍCULO ***");
        super.saidaDeDados();
        System.out.println("Marca: "+getCarBrand());
        System.out.println("Ano modelo: "+getModelYear());
    }

}
