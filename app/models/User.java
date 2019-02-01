package models;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class User {


    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public enum  Role{
        ADMIN,
        USER
    }

    public enum State{
        PENDING,
        VERIFIED,
        LOCKED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("Id")
    private Integer Id;

    @Basic
    @JsonProperty("name")
    private String name;

    @Basic
    @JsonProperty("email")
    private String email;

    @Basic
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Basic
    @JsonProperty("token")
    private String accessToken;

    Role role;
    State state;

    public User() {
   //Important for json serialization
    }

    public User(String name,String email,String password,String accessToken) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.accessToken = accessToken;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }


}
