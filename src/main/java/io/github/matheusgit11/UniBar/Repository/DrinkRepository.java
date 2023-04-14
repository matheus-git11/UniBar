package io.github.matheusgit11.UniBar.Repository;

import io.github.matheusgit11.UniBar.Domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DrinkRepository extends JpaRepository<Drink,Integer> {


}
