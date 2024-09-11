package com.juljocd.consulta_fipe.consultaVeiculo;

public class VeiculoResponse {

    private String nome;
    private int valor;

    public VeiculoResponse(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }

    public Veiculo toModel() {
        return new Veiculo(
                this.nome,
                this.valor
        );
    }
}
