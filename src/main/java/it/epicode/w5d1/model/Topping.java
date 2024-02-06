package it.epicode.w5d1.model;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Topping {

    private String name;
    private double price;

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Topping() {

    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
