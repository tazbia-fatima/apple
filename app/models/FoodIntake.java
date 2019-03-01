package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
public class FoodIntake {

    public enum MealType{
        BREAKFAST,
        LUNCH,
        DINNER
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("Id")
    public Integer Id;

    @ManyToOne
    public User user;

    @Basic
    @JsonProperty("date")
    Date date = new Date();

    @ManyToOne
    public Food food;

    @Basic
    @JsonProperty("quantity")
    private Integer quantity;

    @Basic
    public MealType mealType;

    public FoodIntake() {
    }

    @Override
    public String toString() {
        return "Food " + food + " quantity " + quantity;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }
}