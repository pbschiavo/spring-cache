package com.example.infrastructure.configuracao;

import com.example.dominio.adaptadores.services.SolicitacaoServiceImp;
import com.example.dominio.portas.interfaces.CacheCleanerPort;
import com.example.infrastructure.adaptadores.repositories.SolicitacaoRepository;
import com.example.dominio.portas.interfaces.SolicitacaoServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguracao {
    @Bean
    SolicitacaoServicePort service (SolicitacaoRepository solicitacaoRepository, CacheCleanerPort cacheCleanerPort){
        return new SolicitacaoServiceImp(solicitacaoRepository, cacheCleanerPort);
    }
}
