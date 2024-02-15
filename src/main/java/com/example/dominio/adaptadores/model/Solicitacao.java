package com.example.dominio.adaptadores.model;


public record Solicitacao(
        Long codigo,
        String nome,
        String sexo,
        String idade) {

    @Override
    public Long codigo() {
        return codigo;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public String sexo() {
        return sexo;
    }

    @Override
    public String idade() {
        return idade;
    }
}
