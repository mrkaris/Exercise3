/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author bestuser
 */
public class Car {
    
    private int id;
    private String model;
    private String brand;
    private int horsepower;

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", model=" + model + ", brand=" + brand + ", horsepower=" + horsepower + '}';
    }

    public Car() {
    }

    public Car(String model, String brand, int horsepower) {
        this.model = model;
        this.brand = brand;
        this.horsepower = horsepower;
    }

    public Car(int id, String model, String brand, int horsepower) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.horsepower = horsepower;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
    
    
    
}
