package dev.java10x.Fridge.controller;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    private final FoodService _foodService;

    public FoodController(FoodService foodService) {
        _foodService = foodService;
    }
    @GetMapping
    public List<Food> getAll(){return _foodService.getAll();}

    @PostMapping
    public Food create(@RequestBody Food food){return _foodService.save(food);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {_foodService.delete(id);}
}
