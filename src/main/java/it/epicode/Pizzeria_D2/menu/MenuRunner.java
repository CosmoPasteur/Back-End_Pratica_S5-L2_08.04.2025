package it.epicode.Pizzeria_D2.menu;

import it.epicode.Pizzeria_D2.bevanda.Bevanda;
import it.epicode.Pizzeria_D2.pizza.Pizza;
import it.epicode.Pizzeria_D2.topping.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
@RequiredArgsConstructor
public class MenuRunner implements CommandLineRunner {

    private final Menu menuPranzo;
    private final Topping mozzarella;
    private final Topping olive;
    private final Topping funghi;
    private final Topping peperoni;
    private final Topping pomodoro;

    private final Pizza margherita;
    private final Pizza pizzaPeperoni;
    private final Pizza pizzaFunghi;
    private final Pizza pizzaOlive;

    private final Bevanda cocaCola;
    private final Bevanda sprite;
    private final Bevanda fanta;

    public static void printMenu(List<RigaMenu> righe) {
        for (RigaMenu riga : righe) {
            System.out.println(riga.descrizioneRiga());
        }
    }

    @Override
    public void run(String... args) throws Exception {
        menuPranzo.stampaMenu();

        System.out.println("-----------------");
        System.out.println("Stampa statica");
        System.out.println("-----------------");
        printMenu(List.of(
                new Titolo("Menu Pranzo"),
                new Titolo("Pizze"),
                margherita,
                pizzaPeperoni,
                pizzaFunghi,
                pizzaOlive,
                new Titolo("Bevande"),
                cocaCola,
                sprite,
                fanta,
                new Titolo("Toppings"),
                mozzarella,
                olive,
                funghi,
                peperoni,
                pomodoro
        ));

    }
}
