package dev.java10x.Fridge.mapper;

import dev.java10x.Fridge.dto.FoodDTO;
import dev.java10x.Fridge.model.Food;

public class FoodMapper {

    public static FoodDTO toDTO(Food food) {
        FoodDTO dto = new FoodDTO();
        dto.setId(food.getId());
        dto.setName(food.getName());
        dto.setExpirationDate(food.getExpirationDate());
        dto.setQuantity(food.getQuantity());
        return dto;
    }

    public static Food toEntity(FoodDTO dto) {
        Food food = new Food();
        food.setId(dto.getId());
        food.setName(dto.getName());
        food.setExpirationDate(dto.getExpirationDate());
        food.setQuantity(dto.getQuantity());
        return food;
    }
}
