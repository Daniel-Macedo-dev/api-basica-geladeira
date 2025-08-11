package dev.java10x.Fridge.dto;

import java.time.LocalDate;

public class FoodDTO {
    private Long _id;
    private String _name;
    private LocalDate _expirationDate;
    private Integer _quantity;


    public Long getId() {return _id;}

    public void setId(Long id) {_id = id;}

    public String getName() {return _name;}

    public void setName(String name) {_name = name;}

    public LocalDate getExpirationDate() {return _expirationDate;}

    public void setExpirationDate(LocalDate expirationDate) {_expirationDate = expirationDate;}

    public Integer getQuantity() {return _quantity;}

    public void setQuantity(Integer quantity) {_quantity = quantity;}
}
