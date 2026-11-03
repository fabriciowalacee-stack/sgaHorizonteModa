
package com.horizontemoda.service;

import com.horizontemoda.model.Solicitacao;

public class SolicitacaoService {

    public String consultarSituacao(Solicitacao solicitacao) {
        return solicitacao.getSituacao();
    }

    public boolean situacaoValida(String situacao) {
        return "Pendente".equals(situacao)
            || "Em andamento".equals(situacao)
            || "Concluída".equals(situacao);
    }
}
