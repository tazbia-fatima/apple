package models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

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
    @JsonProperty("token")
    private String accessToken;

    @Basic
    @JsonIgnore
    private String passwordHash;

    @Basic
    @JsonIgnore
    private String salt;

    @Basic
    @JsonIgnore
    private Integer hashIterations;

    Role role;
    State state;

    public User() {
   //Important for json serialization
    }

<<<<<<< HEAD
    public User(String name,String passwordHash,String salt,Integer hashIterations,String email,Role role,State state,String accessToken) {

=======
    public User(String name,String email,String password,Role role,State state,String accessToken) {
>>>>>>> 0511057228a9fb6077501750f6762884c4fbeea0
        this.name = name;
        this.passwordHash = passwordHash;
        this.salt = salt;
        this.hashIterations = hashIterations;
        this.email = email;
<<<<<<< HEAD
=======
        this.password = password;
>>>>>>> 0511057228a9fb6077501750f6762884c4fbeea0
        this.role = role;
        this.state = state;
        this.accessToken = accessToken;

    }


<<<<<<< HEAD
=======


>>>>>>> 0511057228a9fb6077501750f6762884c4fbeea0
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getHashIterations() {
        return hashIterations;
    }

    public void setHashIterations(Integer hashIterations) {
        this.hashIterations = hashIterations;
    }


    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

<<<<<<< HEAD
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

=======
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
>>>>>>> 0511057228a9fb6077501750f6762884c4fbeea0
        this.accessToken = accessToken;
    }

}
