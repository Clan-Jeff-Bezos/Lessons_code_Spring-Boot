package com.riwi.RiwiMovies.entities;

import jakarta.persistence.*;

@Entity(name = "user_entity")
// lombok, validation y swagger
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id; // Varchar(255)
    private String name;
    private String email;
    private String password;
    private Boolean status;

    public UserEntity() {
    }

    public UserEntity(String id, String password, String name, String email, Boolean status) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
