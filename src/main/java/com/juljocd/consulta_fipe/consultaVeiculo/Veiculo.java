package com.juljocd.consulta_fipe.consultaVeiculo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotNull
    private Integer valor;

    @Deprecated
    public Veiculo() {
    }

    public Veiculo(String nome, Integer valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public @NotBlank String getNome() {
        return nome;
    }

    public @NotNull Integer getValor() {
        return valor;
    }
}
