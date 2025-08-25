package dev.java10x.Fridge.mapper;

import dev.java10x.Fridge.dto.FoodDTO;
import dev.java10x.Fridge.model.Food;

public class FoodMapper {

    // Entidade → Record
    public static FoodDTO toDTO(Food food) {
        return new FoodDTO(
                food.getId(),
                food.getName(),
                food.getExpirationDate(),
                food.getQuantity()
        );
    }

    // Record → Entidade
    public static Food toEntity(FoodDTO dto) {
        Food food = new Food();
        food.setId(dto.id());            // record gera getters com o mesmo nome do campo
        food.setName(dto.name());
        food.setExpirationDate(dto.expirationDate());
        food.setQuantity(dto.quantity());
        return food;
    }
}
