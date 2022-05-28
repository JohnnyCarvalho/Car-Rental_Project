/*
 * @created 28/052022 - 19:15
 * @project Car-Rental_Project
 * @author Johnny Carvalho
 */

package com.company;

public class Cars extends Register {

    private Integer ID;
    private String name;
    private String carBrand;
    private Integer numberDocument;
    private Integer modelYear;

    public Cars() {
    }

    @Override
    public Integer getID() {
        return ID;
    }

    @Override
    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public Integer getNumberDocument() {
        return numberDocument;
    }

    @Override
    public void setNumberDocument(Integer numberDocument) {
        this.numberDocument = numberDocument;
    }

    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }
}
