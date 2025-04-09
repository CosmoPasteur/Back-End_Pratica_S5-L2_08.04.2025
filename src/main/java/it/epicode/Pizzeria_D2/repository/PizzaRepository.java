package it.epicode.Pizzeria_D2.repository;

import it.epicode.Pizzeria_D2.pizza.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
