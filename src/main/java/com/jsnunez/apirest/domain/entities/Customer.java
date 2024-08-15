package com.jsnunez.apirest.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
   @Id
    @Column(columnDefinition = "VARCHAR(20)", nullable = false)
    private int idCustomer;
    @Column(columnDefinition = "VARCHAR(60)", nullable = false)  
    String namecustomer;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)  
    String lastnamecustomer;

    
    @Column(columnDefinition = "VARCHAR(5)", nullable = false)  
    String codecitycustomer;

    @Column(columnDefinition = "VARCHAR(100)", nullable = false)  
    String emailcustomer;

    @Column(columnDefinition = "DATE", nullable = false)  
    String birthdate;
    
    @Column(columnDefinition = "FLOAT8", nullable = false)  
    float lon;
    @Column(columnDefinition = "FLOAT8", nullable = false)  
    float latitud;
}
