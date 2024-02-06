package it.epicode.w5d1.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class MenuItem {
    private String name;
    private BigDecimal price;
    private List<NutritionalInformation> nutritionalInformation;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setNutritionalInformation(List<NutritionalInformation> nutritionalInformation) {
        this.nutritionalInformation = nutritionalInformation;
    }

    public MenuItem(String name, BigDecimal price, List<NutritionalInformation> nutritionalInformation) {
        this.name = name;
        this.price = price;
        this.nutritionalInformation = nutritionalInformation;
    }
}
