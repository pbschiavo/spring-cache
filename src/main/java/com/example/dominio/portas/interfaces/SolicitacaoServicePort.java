package com.example.dominio.portas.interfaces;

import com.example.dominio.adaptadores.model.Solicitacao;

import java.util.List;

public interface SolicitacaoServicePort {

    void solicitacao(Solicitacao solicitacao);

    List<Solicitacao> buscarTodasSolicitacoes();
}
