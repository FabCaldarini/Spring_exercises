package it.epicode.w5d1.bean;

import it.epicode.w5d1.model.Beverage;
import it.epicode.w5d1.model.Pizza;
import it.epicode.w5d1.model.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "it.epicode.w5d1.bean")
public class PizzaConfig {
    @Bean
    public Pizza margherita() {
        Pizza pizza = new  Pizza();
        pizza.setName("Margherita");
        pizza.setPrice(5.0);

        return pizza;
    }
    @Bean
    public Pizza hawaiianPizza() {
       Pizza pizza = new Pizza();
       pizza.setName("Hawaiian");
       pizza.setPrice(8.0);

       return pizza;


    }
    @Bean
    public Beverage coke() {
        Beverage beverage = new Beverage();
        beverage.setName("Coke");
        beverage.setPrice(2.0);
        return beverage;

    }
    @Bean
    public Topping prosciutto(){
        Topping topping = new Topping();
        topping.setName("Prosciutto");
        topping.setPrice(1.0);
        return topping;
    }
    @Bean
    public Topping ananas(){
       Topping topping =  new Topping();
       topping.setName("Ananas");
       topping.setPrice(1.0);
       return topping;

    }


}
