package it.epicode.Pizzeria_D2.bevanda;

import it.epicode.Pizzeria_D2.menu.RigaMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bevanda implements RigaMenu {

    private String name;
    private String description;
    private double price;
    private double calories;

    @Override
    public String descrizioneRiga() {
        return name + " - " + description + " - " + price + " € " + calories + " kcal";
    }
}
