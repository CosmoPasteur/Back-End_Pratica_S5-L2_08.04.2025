package it.epicode.Pizzeria_D2.menu;

import it.epicode.Pizzeria_D2.bevanda.Bevanda;
import it.epicode.Pizzeria_D2.pizza.Pizza;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private String nome;
    private String descrizione;

    private List<Pizza> pizze = new ArrayList<>();
    private List<Bevanda> bevande = new ArrayList<>();;
    private List<Topping> toppings = new ArrayList<>();;

    public void stampaMenu() {
        System.out.println("Menu: " + nome + " - " + descrizione);
        System.out.println("Pizze:");
        for (Pizza pizza : pizze) {
            System.out.println(pizza.descrizioneRiga());
        }
        System.out.println("Bevande:");
        for (Bevanda bevanda : bevande) {
            System.out.println(bevanda.descrizioneRiga());
        }
        System.out.println("Toppings:");
        for (Topping topping : toppings) {
            System.out.println(topping.descrizioneRiga());
        }

    }
}
