/*
 * @created 28/052022 - 19:15
 * @project Car-Rental_Project
 * @author Johnny Carvalho
 */

package com.company;

public class Cars extends Register {

    private Integer modelYear;
    private String carBrand;

    public Cars() {}


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

}
