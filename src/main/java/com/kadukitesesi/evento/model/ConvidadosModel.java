package com.kadukitesesi.evento.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ConvidadosModel {

    @Id
    Long id;

    int acompanhantes;
}
