package dev.java10x.Fridge.dto;

import java.time.LocalDate;

// Record substitui a classe DTO
public record FoodDTO(Long id, String name, LocalDate expirationDate, Integer quantity) { }
