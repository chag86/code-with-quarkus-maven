package org.acme;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Usuario extends PanacheEntity{

    public String nome;

    public Integer idade;
    
}