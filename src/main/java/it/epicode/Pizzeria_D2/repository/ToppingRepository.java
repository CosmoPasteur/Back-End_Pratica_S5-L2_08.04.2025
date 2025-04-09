package it.epicode.Pizzeria_D2.repository;

import it.epicode.Pizzeria_D2.topping.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepository extends JpaRepository<Topping, Long> {
}
