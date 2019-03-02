package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Profile {

//    public enum  Gender{
//        MALE,
//        FEMALE,
//        OTHER
//    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("Id")
    private Integer Id;


    @OneToOne
    public User user;


    @Basic
    @JsonProperty("age")
    private Integer age;

    @Basic
    @JsonProperty("height")
    private Integer height;

    @Basic
    @JsonProperty("weight")
    private Integer weight;

//    @Basic
//    public Gender gender;



    public Profile() {
        //Important for json serialization
    }

    @Override
    public String toString() {
        return "User " + user + " age " + age + "height" + height + "weight" + weight;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

//    public Gender getGender() {
//        return gender;
//    }
//
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }


}