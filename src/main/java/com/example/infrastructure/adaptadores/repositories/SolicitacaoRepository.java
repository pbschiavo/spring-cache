package com.example.infrastructure.adaptadores.repositories;

import com.example.infrastructure.adaptadores.entidades.SolicitacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitacaoRepository extends JpaRepository<SolicitacaoEntity, Long> {

}
