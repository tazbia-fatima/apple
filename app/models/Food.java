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

    public Food() {
    }

    public Food(String name, Integer calories) {
        this.name = name;
        this.calories = calories;
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

}
