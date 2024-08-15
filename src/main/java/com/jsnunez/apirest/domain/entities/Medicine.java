package com.jsnunez.apirest.domain.entities;

import org.springframework.context.annotation.Primary;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medicine {
@Id
@Column(columnDefinition = "INT",nullable = false)
private int id; 

@Column(columnDefinition = "VARCHAR(10)",nullable = false)
private String proceedings; 

@Column(columnDefinition = "VARCHAR(100)",nullable = false)
private String namemedicine; 

@Column(columnDefinition = "VARCHAR(50)",nullable = false)
private String healthregister;


@Column(columnDefinition = "TEXT",nullable = false)
private String description;


@Column(columnDefinition = "VARCHAR(60)",nullable = false)
private String descriptionshort;
@Column(columnDefinition = "VARCHAR(100)",nullable = false)
private String namerol;
public Medicine() {
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getProceedings() {
    return proceedings;
}
public void setProceedings(String proceedings) {
    this.proceedings = proceedings;
}
public String getNamemedicine() {
    return namemedicine;
}
public void setNamemedicine(String namemedicine) {
    this.namemedicine = namemedicine;
}
public String getHealthregister() {
    return healthregister;
}
public void setHealthregister(String healthregister) {
    this.healthregister = healthregister;
}
public String getDescription() {
    return description;
}
public void setDescription(String description) {
    this.description = description;
}
public String getDescriptionshort() {
    return descriptionshort;
}
public void setDescriptionshort(String descriptionshort) {
    this.descriptionshort = descriptionshort;
}
public String getNamerol() {
    return namerol;
}
public void setNamerol(String namerol) {
    this.namerol = namerol;
}

    // codemodeadmin INT,
    // codeap INT,
    // codeum INT,
    // codelab INT,

    
}
