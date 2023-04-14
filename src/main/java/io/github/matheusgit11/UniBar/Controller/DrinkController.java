package io.github.matheusgit11.UniBar.Controller;

import io.github.matheusgit11.UniBar.Domain.Drink;
import io.github.matheusgit11.UniBar.Repository.DrinkRepository;
import io.github.matheusgit11.UniBar.Service.DrinkService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/drinks")
public class DrinkController {

    private final DrinkService service;
    private final DrinkRepository repository;

    public DrinkController(DrinkService service, DrinkRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @GetMapping
    public List<Drink>  returnAllDrinks(){
       return repository.findAll();
    }

    @PostMapping
    public ResponseEntity saveDrink(@RequestBody Drink drink){
        repository.save(drink);
        return ResponseEntity.ok(drink);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteDrink(@PathVariable int id){
        Optional<Drink> deletedDrink = repository.findById(id);
        repository.deleteById(id);
        return ResponseEntity.ok(deletedDrink);
    }

}
