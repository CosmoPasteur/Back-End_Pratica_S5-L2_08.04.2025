package it.epicode.Pizzeria_D2.topping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig {
    @Bean
    public Topping mozzarella() {
        return new Topping("Mozzarella", "Cheese", 2.0, 120);
    }


    @Bean
    public Topping olive() {
        return new Topping("Olive", "Vegetable", 2.0, 120);
    }

    @Bean
    public Topping funghi() {
        return new Topping("Funghi", "Vegetable", 2.0, 120);
    }

    @Bean
    public Topping peperoni() {
        return new Topping("Peperoni", "Meat", 2.0, 160);
    }

    @Bean
    public Topping pomodoro() {
        return new Topping("Pomodoro", "Vegetable", 2.0, 120);
    }

}
