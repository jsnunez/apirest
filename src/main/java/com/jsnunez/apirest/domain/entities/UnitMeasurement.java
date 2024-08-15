package com.jsnunez.apirest.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UnitMeasurement {

    @Id
    @Column(columnDefinition = "INT", nullable = false)
    private int idum;
    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private int nameum;
    public UnitMeasurement() {
    }
    public int getIdum() {
        return idum;
    }
    public void setIdum(int idum) {
        this.idum = idum;
    }
    public int getNameum() {
        return nameum;
    }
    public void setNameum(int nameum) {
        this.nameum = nameum;
    }


}
