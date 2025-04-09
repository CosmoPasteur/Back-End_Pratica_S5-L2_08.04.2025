package it.epicode.Pizzeria_D2.repository;

import it.epicode.Pizzeria_D2.bevanda.Bevanda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BevandaRepository extends JpaRepository<Bevanda, Long> {
}
