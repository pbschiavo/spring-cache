package com.example.infrastructure.adaptadores.repositories;

import com.example.dominio.adaptadores.model.Solicitacao;
import com.example.dominio.portas.repositories.SolicitacaoRepositoryPort;
import com.example.infrastructure.adaptadores.entidades.SolicitacaoEntity;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class SolicitacaoRepositoryImp implements SolicitacaoRepositoryPort {

    private final SolicitacaoRepository solicitacaoRepository;

    @Override
    public List<Solicitacao> solicitacao() {
        List<SolicitacaoEntity> produtoEntities = this.solicitacaoRepository.findAll();
        return produtoEntities.stream().map(SolicitacaoEntity::toProduto).collect(Collectors.toList());
    }

    @Override
    public void buscarTodasSolicitacoes() {

    }
}
