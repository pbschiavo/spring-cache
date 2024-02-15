package com.example.aplicacao.adaptadores.controllers;

import com.example.dominio.adaptadores.dtos.ResponseDTO;
import com.example.dominio.adaptadores.model.Solicitacao;
import com.example.dominio.portas.interfaces.SolicitacaoServicePort;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/minhaapi")
@RequiredArgsConstructor
public class SolicitacaoController {

    private final SolicitacaoServicePort exemploServicePort;

    @Operation(
            summary = "Solicitação",
            description = "Solicitação de xpto"
    )
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Sucesso",
                            content = @Content(schema = @Schema(implementation = ResponseDTO.class))
                    ),
                    @ApiResponse(
                            responseCode = "400",
                            description = "Requisição inválida",
                            content = @Content(schema = @Schema(implementation = ErrorResponse.class))
                    )
            }
    )
    @PostMapping("/solicitacao")
    ResponseEntity<ResponseDTO> solicitacao(@RequestBody Solicitacao solicitacao) {
        exemploServicePort.solicitacao(solicitacao);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/todasSolicitacoes")
    List<Solicitacao> todasSolicitacoes(){
        return exemploServicePort.buscarTodasSolicitacoes();
    }

}

