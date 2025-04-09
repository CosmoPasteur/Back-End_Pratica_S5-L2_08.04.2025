package it.epicode.Pizzeria_D2.pizza;

import it.epicode.Pizzeria_D2.menu.RigaMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza implements RigaMenu {
    private String name;
    private String description;
    private double price;
    private int calories;
    private List<Topping> toppings = new ArrayList<>();

    public String toppingsToString() {
        String toppingsString = toppings.stream().map(Topping::getName).reduce("", (a, b) -> a + ", " + b);
        return toppingsString;
    }

    public double getTotalPrice() {
        double totalPrice = price;
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }

    public int getTotalCalories() {
        int totalCalories = calories;
        for (Topping topping : toppings) {
            totalCalories += topping.getCalories();
        }
        return totalCalories;
    }

    @Override
    public String descrizioneRiga() {
        return name + " - " + description + " - " + getTotalPrice() + " € " + getTotalCalories() + " kcal";
    }
}
