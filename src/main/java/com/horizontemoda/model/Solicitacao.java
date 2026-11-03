
package com.horizontemoda.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Solicitacao {

    private Long id;
    private String nomeCliente;
    private String canal;
    private String descricao;
    private LocalDate prazo;
    private String situacao = "Pendente";
    private LocalDateTime dataAbertura = LocalDateTime.now();

    public Solicitacao(String nomeCliente,
                       String canal,
                       String descricao,
                       LocalDate prazo) {
        this.nomeCliente = nomeCliente;
        this.canal = canal;
        this.descricao = descricao;
        this.prazo = prazo;
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

    public String getSituacao() {
        return situacao;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }
}
