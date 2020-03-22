package com.java.entity;

import org.springframework.beans.factory.annotation.Value;

public class Person {

    @Value("${person.id}")
    private String id;

    @Value("${person.name}")
    private String name;

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

}
