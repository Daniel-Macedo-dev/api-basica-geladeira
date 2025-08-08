package dev.java10x.Fridge.service;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FoodService {

    private final FoodRepository _foodRepository;

    public FoodService(FoodRepository foodRepository) {
        _foodRepository = foodRepository;
    }

    //Listar
    public List<Food> getAll() {return _foodRepository.findAll();}

    //Criar
    public Food save(Food food) {return _foodRepository.save(food);}

    //Deletar
    public void delete(Long id){_foodRepository.deleteById(id);}
}
