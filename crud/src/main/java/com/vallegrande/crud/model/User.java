package com.vallegrande.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Users")
public class User {

    @Id
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String dni;

    public User() {
    }

    public User(String id, String name, String lastName, String email, String dni) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.dni = dni;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
