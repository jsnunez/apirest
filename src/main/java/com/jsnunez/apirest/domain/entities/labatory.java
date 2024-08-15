package com.jsnunez.apirest.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class labatory {
    @Id
    @Column(columnDefinition = "INT", nullable = false)
    private int id;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String nameregion;

    @ManyToOne
    @JoinColumn(name = "codecityreg")
    private City city;

    public labatory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameregion() {
        return nameregion;
    }

    public void setNameregion(String nameregion) {
        this.nameregion = nameregion;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }



    
}
