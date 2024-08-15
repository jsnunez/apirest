package com.jsnunez.apirest.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Farmacy {

    @Id
    @Column(columnDefinition ="INT", nullable = false)
    private int idfarmacy;

    @Column(columnDefinition ="VARCHAR(60)", nullable = false)
    private String namefarmacy;

    @Column(columnDefinition ="VARCHAR(100)", nullable = false)
    private String addressfarmacy;

    @Column(columnDefinition ="DOUBLE", nullable = false)
    private long longitude;

    @Column(columnDefinition ="DOUBLE", nullable = false)
    private long latfarmacy;

    public Farmacy() {
    }

    public Farmacy(int idfarmacy, String namefarmacy, String addressfarmacy, long longitude, long latfarmacy) {
        this.idfarmacy = idfarmacy;
        this.namefarmacy = namefarmacy;
        this.addressfarmacy = addressfarmacy;
        this.longitude = longitude;
        this.latfarmacy = latfarmacy;
    }
    
}
