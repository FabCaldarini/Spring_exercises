package it.epicode.w5d1.bean;

import it.epicode.w5d1.model.Beverage;
import it.epicode.w5d1.model.Menu;
import it.epicode.w5d1.model.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "it.epicode.w5d1.bean")
public class MenuConfig {
    @Bean
    public Menu menu(Pizza margherita, Pizza hawaiianPizza, Beverage coke) {
        return new Menu(List.of(margherita, hawaiianPizza), List.of(coke));
    }
}
