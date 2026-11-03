
package com.horizontemoda.service;

import com.horizontemoda.model.Solicitacao;

public class SolicitacaoService {

    public String consultarSituacao(Solicitacao solicitacao) {
        if (solicitacao == null) {
            throw new IllegalArgumentException(
                "A solicitacao nao pode ser nula."
            );
        }

        return solicitacao.getSituacao();
    }

    public boolean situacaoValida(String situacao) {
        if (situacao == null || situacao.isBlank()) {
            return false;
        }

        return "Pendente".equals(situacao)
            || "Em andamento".equals(situacao)
            || "Concluída".equals(situacao);
    }
}
