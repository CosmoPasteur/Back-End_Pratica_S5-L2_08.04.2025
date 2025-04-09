package it.epicode.Pizzeria_D2.tavolo;

import lombok.Data;

@Data
public class Tavolo {
    private int numeroTavolo;
    private int numeroCopertiMax;
    private StatoTavolo stato=StatoTavolo.LIBERO;

    public Tavolo(int numeroTavolo, int numeroCoperti, StatoTavolo stato) {
        this.numeroTavolo = numeroTavolo;
        this.numeroCopertiMax = numeroCopertiMax;
    }

}
