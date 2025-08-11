package dev.java10x.Fridge.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "food_table")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;
    private String _name;
    private LocalDate _expirationDate;
    private Integer _quantity;

    private String _internalCode;

    public Food(){}
    
    public Food(Long id, String name, LocalDate expirationDate, Integer quantity, String internalCode) {
        _id = id;
        _name = name;
        _expirationDate = expirationDate;
        _quantity = quantity;
        _internalCode = internalCode;
    }

    public Long getId() {return _id;}

    public void setId(Long id) {_id = id;}

    public String getName() {return _name;}

    public void setName(String name) {_name = name;}

    public LocalDate getExpirationDate() {return _expirationDate;}

    public void setExpirationDate(LocalDate expirationDate) {_expirationDate = expirationDate;}

    public Integer getQuantity() {return _quantity;}

    public void setQuantity(Integer quantity) {_quantity = quantity;}

    public String getInternalCode() {return _internalCode;}

    public void setInternalCode(String internalCode) {_internalCode = internalCode;}

}
