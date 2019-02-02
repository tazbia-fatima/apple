package models;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class User {



    public enum  Role {
        ADMIN,
        USER
    }

    public enum State {
        PENDING,
        VERIFIED,
        LOCKED
    }

    @Id
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

    public User(String name,String email,String password,Role role,State state,String accessToken) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.state = state;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getAccessToken(){
        return accessToken;
    }

    public void setAccessToken(String accessToken){
        this.accessToken = accessToken;
    }

}
