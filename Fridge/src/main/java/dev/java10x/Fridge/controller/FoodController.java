package dev.java10x.Fridge.controller;

import dev.java10x.Fridge.dto.FoodDTO;
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
    public List<FoodDTO> getAll() {
        return _foodService.getAll();
    }

    @PostMapping
    public FoodDTO create(@RequestBody FoodDTO foodDTO) {
        return _foodService.save(foodDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        _foodService.delete(id);
    }
}
