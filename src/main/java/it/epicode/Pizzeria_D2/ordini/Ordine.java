package it.epicode.Pizzeria_D2.ordini;

import it.epicode.Pizzeria_D2.menu.RigaMenu;
import it.epicode.Pizzeria_D2.tavolo.Tavolo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ordine {
    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int coperti;
    private LocalTime oraOrdine;
    private List<RigaMenu> elementi=new ArrayList<>();
    private Tavolo tavolo;

    public double calcolaPrezzoTotale(double prezzoUnitarioCoperto) {
        double prezzoTotale = 0;
        for (RigaMenu riga : elementi) {
            prezzoTotale += riga.getPrice();
        }
        prezzoTotale += prezzoUnitarioCoperto * coperti;
        return prezzoTotale;
    }

    public void stampaOrdine(double costoCoperto) {
        System.out.println("Numero ordine: " + numeroOrdine);
        System.out.println("Stato ordine: " + statoOrdine);
        System.out.println("Coperti: " + coperti);
        System.out.println("Ora ordine: " + oraOrdine);
        System.out.println("Tavolo: " + tavolo);
        System.out.println("Elementi: " + elementi);
        for(RigaMenu riga : elementi) {
            System.out.println(riga.descrizioneRiga());
        }
        System.out.println("-----------------");
        System.out.println("Prezzo totale: " + calcolaPrezzoTotale(0));
    }

}
