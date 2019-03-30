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
    public Integer calories;


    @Basic
    @JsonProperty("imageUrl")
    public String imageUrl;


    public Food() {
    }

    public Food(String name, Integer calories, String imageUrl) {
        this.name = name;
        this.calories = calories;
        this.imageUrl = imageUrl;

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
    public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl)
        {
            this.imageUrl = imageUrl;
        }



    //Removed quantity
}
