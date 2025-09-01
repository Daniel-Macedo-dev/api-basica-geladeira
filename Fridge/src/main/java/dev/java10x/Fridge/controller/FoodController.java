package dev.java10x.Fridge.controller;

import dev.java10x.Fridge.dto.FoodDTO;
import dev.java10x.Fridge.service.FoodService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    private final FoodService _foodService;

    public FoodController(FoodService foodService) {_foodService = foodService;}

    @GetMapping
    public ResponseEntity<List<FoodDTO>> getAll() {
        return ResponseEntity.ok(_foodService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FoodDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(_foodService.getById(id));
    }


    @PostMapping
    public ResponseEntity<FoodDTO> create(@RequestBody FoodDTO foodDTO) {
        FoodDTO saved = _foodService.save(foodDTO);
        return ResponseEntity.ok(saved);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        _foodService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
