package it.epicode.Pizzeria_D2.menu;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MenuRunner implements CommandLineRunner {

    private final Menu menuPranzo;

    @Override
    public void run(String... args) throws Exception {
        menuPranzo.stampaMenu();
    }
}
