package com.jsnunez.apirest.domain.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Activeprinciple {

       @Id
    @Column(columnDefinition = "INT", nullable = false)
    private int idap;
    @Column(columnDefinition = "VARCHAR(60)", nullable = false)
    private String nameap;
}
