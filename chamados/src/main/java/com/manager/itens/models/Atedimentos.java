package com.manager.itens.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "atedimentos")
public class Atedimentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "descricao")
    private String descricao; 
    
    @Column(name = "dias")
    private int dias;


	@ManyToOne
	@JoinColumn(name = "id_chamado", referencedColumnName = "id")
	private Chamados chamados;

    public Atedimentos() {

    }
    public Atedimentos(Long id) {
        this.id = id;
    }

    public Atedimentos(String descricao, int dias, Chamados chamados) {
        this.descricao = descricao;
        this.dias = dias;
        this.chamados = chamados;
    }

    public Atedimentos(Long id, String descricao, int dias, Chamados chamados) {
        this.id = id;
        this.descricao = descricao;
        this.dias = dias;
        this.chamados = chamados;
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Atedimentos that = (Atedimentos) object;
        return dias == that.dias && java.util.Objects.equals(id, that.id) && java.util.Objects.equals(descricao, that.descricao) && java.util.Objects.equals(chamados, that.chamados);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), id, descricao, dias, chamados);
    }
}