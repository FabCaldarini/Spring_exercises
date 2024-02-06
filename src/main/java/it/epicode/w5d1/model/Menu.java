package it.epicode.w5d1.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Menu {
    private List<Pizza> pizzas;
    private List<Beverage> beverages;

    public Menu(List<Pizza> pizzas, List<Beverage> beverages) {
        this.pizzas=pizzas;
        this.beverages=beverages;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizzas=" + pizzas +
                ", beverages=" + beverages +
                '}';
    }
}

