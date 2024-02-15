package com.example.dominio.adaptadores.cache;

import com.example.dominio.adaptadores.model.Solicitacao;
import com.example.dominio.portas.interfaces.CacheCleanerPort;
import com.example.infrastructure.adaptadores.entidades.SolicitacaoEntity;
import com.example.infrastructure.adaptadores.repositories.SolicitacaoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@RequiredArgsConstructor
public class CacheCleanerImp implements CacheCleanerPort {

    private final SolicitacaoRepository solicitacaoRepository;

    @Override
    @CacheEvict(value = "solicitacoes", allEntries = true)
    public void limpaCache() {
        log.info("limpando cache");
    }

    @Override
    @CachePut(value = "solicitacoes")
    public List<Solicitacao> atualizarCacheSolicitacoes() {
        log.info("atualizando cache");
        List<SolicitacaoEntity> produtoEntities = this.solicitacaoRepository.findAll();
        return produtoEntities.stream().map(SolicitacaoEntity::toProduto).collect(Collectors.toList());
    }
}
