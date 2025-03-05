package com.manager.itens.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "chamados")
public class Chamados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    public Chamados() {

    }

    public Chamados(Long id) {
        this.id = id;
    }

    public Chamados(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chamados chamados = (Chamados) o;
        return Objects.equals(id, chamados.id) && Objects.equals(titulo, chamados.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo);
    }
}