package com.example.dominio.portas.repositories;

import com.example.dominio.adaptadores.model.Solicitacao;

import java.util.List;

public interface SolicitacaoRepositoryPort {

    List<Solicitacao> solicitacao();

    void buscarTodasSolicitacoes();
}
