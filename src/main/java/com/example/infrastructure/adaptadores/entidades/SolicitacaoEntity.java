package com.example.infrastructure.adaptadores.entidades;

import com.example.dominio.adaptadores.model.Solicitacao;
import jakarta.persistence.*;

@Entity
@Table(name = "solicitacao")
public class SolicitacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nome;

    private String sexo;
    private String idade;

    public SolicitacaoEntity() {}

    public SolicitacaoEntity(Solicitacao solicitacao) {
        this.codigo = solicitacao.codigo();
        this.nome = solicitacao.nome();
        this.sexo = solicitacao.sexo();
        this.idade = solicitacao.idade();
    }

    public void atualizar(Solicitacao solicitacao) {
        this.codigo = solicitacao.codigo();
        this.nome = solicitacao.nome();
        this.sexo = solicitacao.sexo();
        this.idade = solicitacao.idade();
    }

    public Solicitacao toProduto() {
        return new Solicitacao(this.codigo, this.nome, this.idade, this.sexo);
    }


}
