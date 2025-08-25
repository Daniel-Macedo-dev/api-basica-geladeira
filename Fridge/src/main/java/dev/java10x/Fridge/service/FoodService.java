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

    // Listar todos (retorna lista de Records)
    public List<FoodDTO> getAll() {
        return _foodRepository.findAll()
                .stream()
                .map(FoodMapper::toDTO)  // mapper já cria record
                .collect(Collectors.toList());
    }

    // Criar um novo (recebe record e retorna record)
    public FoodDTO save(FoodDTO dto) {
        Food food = FoodMapper.toEntity(dto); // converte record para entidade
        Food saved = _foodRepository.save(food); // salva no banco
        return FoodMapper.toDTO(saved); // converte de volta para record
    }

    // Deletar (por id)
    public void delete(Long id) {
        _foodRepository.deleteById(id);
    }
}
