package com.juanvargas.walletapp;

public class Account {
    // Atributos de la clase
    private String name; // Nombre de la cuenta
    private String type; // Tipo de cuenta
    private double currentValue; // Valor actual de la cuenta//

    private String imageUrl;


    public Account(String name, String type, double currentValue, String imageUrl) {
        this.name = name;
        this.type = type;
        this.currentValue = currentValue;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
