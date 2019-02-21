package models;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("Id")
    private Integer Id;

    @Basic
    @JsonProperty("name")
    private String name;

    @Basic
    @JsonProperty("calories")
    private Integer calories;

    @Basic
    @JsonProperty("quantity")
    private Integer quantity;


    public Food() {
    }

    public Food(String name, Integer calories,Integer quantity) {
        this.name = name;
        this.calories = calories;
        this.quantity = quantity;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Integer getCalories() {

        return calories;
    }

    public void setCalories(Integer calories) {

        this.calories = calories;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
