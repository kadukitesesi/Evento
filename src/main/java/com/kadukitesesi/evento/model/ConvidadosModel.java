package com.kadukitesesi.evento.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;

@Entity
public class ConvidadosModel {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator( name = "increment", strategy = "increment")
    private Long id;

    private String nome;

    private int acompanhantes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAcompanhantes() {
        return acompanhantes;
    }

    public void setAcompanhantes(int acompanhantes) {
        this.acompanhantes = acompanhantes;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConvidadosModel that = (ConvidadosModel) o;
        return acompanhantes == that.acompanhantes && Objects.equals(id, that.id) && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, acompanhantes);
    }

    @Override
    public String toString() {
        return "Convidado [id=" + id + ", nome=" + nome + ", quantidadeAcompanhantes=" + acompanhantes + "]";
    }
}
