package com.example.dominio.portas.interfaces;

import com.example.dominio.adaptadores.model.Solicitacao;

import java.util.List;

public interface CacheCleanerPort {

    List<Solicitacao> atualizarCacheSolicitacoes();
    void limpaCache();
}
