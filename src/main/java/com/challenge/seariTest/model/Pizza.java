package com.challenge.seariTest.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Pizza {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @NotBlank(message = "Name is mandatory")
    @Size(min = 3, max = 15, message = "Name should have 3 - 15 characters")
    private String name;

    @Min(value = 1, message = "Quantity should greater than 1")
    @Max(value = 100, message = "Quantity should smaller than 100")
    @Digits(integer=3, fraction=0, message = "Price should be integer")
    @NotNull(message = "Quantity is mandatory")
    private BigDecimal quantity;

    @Min(value = 1, message = "Price should greater than 1")
    @Max(value = 100, message = "Price should smaller than 100")
    @Digits(integer=3, fraction=2, message = "Price should in ###.## format")
    @NotNull(message = "Price is mandatory")
    private BigDecimal price;

    public Pizza(String name,BigDecimal quantity,BigDecimal price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

}