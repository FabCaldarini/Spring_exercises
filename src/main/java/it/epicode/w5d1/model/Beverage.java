package it.epicode.w5d1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Beverage {
    private String name;
    private double price;
    private String nutritionalInfo;

    public Beverage(String name, double price, String nutritionalInfo) {
        this.name = name;
        this.price = price;
        this.nutritionalInfo = nutritionalInfo;
    }

    public Beverage() {

    }

    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", nutritionalInfo='" + nutritionalInfo + '\'' +
                '}';
    }
}
