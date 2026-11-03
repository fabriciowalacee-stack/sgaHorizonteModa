
package com.horizontemoda.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Solicitacao {

    private Long id;
    private String nomeCliente;
    private String canal;
    private String descricao;
    private LocalDate prazo;
    private String responsavel;
    private String situacao = "Pendente";
    private LocalDateTime dataAbertura = LocalDateTime.now();
    private LocalDateTime dataConclusao;

    public Solicitacao(String nomeCliente,
                       String canal,
                       String descricao,
                       LocalDate prazo) {
        this.nomeCliente = nomeCliente;
        this.canal = canal;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCanal() {
        return canal;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
    if (!situacao.equals("Pendente") &&
        !situacao.equals("Em andamento") &&
        !situacao.equals("Concluída")) {
        throw new IllegalArgumentException("Situação inválida");
    }

    this.situacao = situacao;
}

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public LocalDateTime getDataConclusao() {
        return dataConclusao;
    }
}
