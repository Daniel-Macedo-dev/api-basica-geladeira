package dev.java10x.Fridge.service;

import dev.java10x.Fridge.dto.FoodDTO;
import dev.java10x.Fridge.mapper.FoodMapper;
import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodService {

    private final FoodRepository _foodRepository;

    public FoodService(FoodRepository foodRepository) {
        _foodRepository = foodRepository;
    }

    // Criar um novo (recebe DTO e retorna DTO)
    public FoodDTO save(FoodDTO dto) {
        Food food = FoodMapper.toEntity(dto);
        Food saved = _foodRepository.save(food);
        return FoodMapper.toDTO(saved);
    }

    // find all
    public List<FoodDTO> getAll() {
        List<Food> foods = _foodRepository.findAll();
        return foods.stream()
                .map(FoodMapper::toDTO)
                .collect(Collectors.toList());
    }

    //find by id
    public FoodDTO getById(Long id) {
        Food food = _foodRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("id não encontrado"));
        return FoodMapper.toDTO(food);
    }

    //update -> put e patch
    public FoodDTO update(Long id, FoodDTO dto) {
        Food existingFood = _foodRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("id não encontrado"));
        existingFood.setName(dto.getName());
        existingFood.setQuantity(dto.getQuantity());
        existingFood.setExpirationDate(dto.getExpirationDate());

        Food updated = _foodRepository.save(existingFood);
        return FoodMapper.toDTO(updated);
    }

    public FoodDTO patch(Long id, FoodDTO dto) {
        Food existingFood = _foodRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("id não encontrado"));
        if (dto.getName() != null) existingFood.setName(dto.getName());
        if (dto.getQuantity() != null) existingFood.setQuantity(dto.getQuantity());
        if (dto.getExpirationDate() != null) existingFood.setExpirationDate(dto.getExpirationDate());

        Food updated = _foodRepository.save(existingFood);
        return FoodMapper.toDTO(updated);
    }

    // Deletar (por id)
    public void delete(Long id) {
        _foodRepository.deleteById(id);
    }
}
