
package com.horizontemoda.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolicitacaoServiceTest {

    private final SolicitacaoService service =
            new SolicitacaoService();

    @Test
    void deveAceitarSituacoesValidas() {
        assertTrue(service.situacaoValida("Pendente"));
        assertTrue(service.situacaoValida("Em andamento"));
        assertTrue(service.situacaoValida("Concluída"));
    }

    @Test
    void deveRejeitarSituacaoInvalida() {
        assertFalse(service.situacaoValida("Cancelada"));
        assertFalse(service.situacaoValida(""));
    }
}
