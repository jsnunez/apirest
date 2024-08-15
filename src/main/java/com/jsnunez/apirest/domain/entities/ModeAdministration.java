package com.jsnunez.apirest.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ModeAdministration {
   @Id
    @Column(columnDefinition = "INT", nullable = false)
    private int id;
    @Column(columnDefinition = "VARCHAR(60)", nullable = false)
    private int descriptionmode;
    public ModeAdministration() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getDescriptionmode() {
        return descriptionmode;
    }
    public void setDescriptionmode(int descriptionmode) {
        this.descriptionmode = descriptionmode;
    }
    
}
