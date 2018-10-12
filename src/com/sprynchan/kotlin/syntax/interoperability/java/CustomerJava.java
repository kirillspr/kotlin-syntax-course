package com.sprynchan.kotlin.syntax.interoperability.java;

import java.util.Objects;

import org.jetbrains.annotations.NotNull;

public class CustomerJava {

    private Long id;
    private String name;
    private String email;

    public CustomerJava() {
    }

    public @NotNull
    String notNullableString() {
        return "Stringsdfsdf";
    }

    public String nullableString() {
        return "Stringsdfsdf";
    }

    public CustomerJava(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void print() {
        System.out.println("Customer id is " + this.id);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerJava that = (CustomerJava) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }
}
