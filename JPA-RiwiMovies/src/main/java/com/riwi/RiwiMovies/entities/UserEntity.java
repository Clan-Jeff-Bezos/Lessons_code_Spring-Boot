package com.riwi.RiwiMovies.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity(name = "user_entity")
// lombok, validation y swagger
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id; // Varchar(255)

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false, length = 20)
    private String password;

    @Column(nullable = false)
    private Boolean status = true;

    public UserEntity() {
    }

    public UserEntity(String id, String name, String email, Integer age, String password, Boolean status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
        this.status = status;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
                ", age=" + age +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
