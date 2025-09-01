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

    // Listar todos (retorna lista de DTOs)
    public List<FoodDTO> getAll() {
        List<Food> foods = _foodRepository.findAll();
        return foods.stream()
                .map(FoodMapper::toDTO)
                .collect(Collectors.toList());
    }
    public FoodDTO getById(Long id) {
        Food food = _foodRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("id não encontrado"));
        return FoodMapper.toDTO(food);
    }


    // Criar um novo (recebe DTO e retorna DTO)
    public FoodDTO save(FoodDTO dto) {
        Food food = FoodMapper.toEntity(dto);
        Food saved = _foodRepository.save(food);
        return FoodMapper.toDTO(saved);
    }

    // Deletar (por id)
    public void delete(Long id) {
        _foodRepository.deleteById(id);
    }
}
