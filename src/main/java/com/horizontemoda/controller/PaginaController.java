
package com.horizontemoda.controller;

import com.horizontemoda.model.Solicitacao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PaginaController {

    private final List<Solicitacao> solicitacoes = new ArrayList<>();

    @GetMapping("/")
    public String paginaInicial() {
        return "inicio";
    }

    @GetMapping("/solicitacoes/nova")
    public String novaSolicitacao() {
        return "nova-solicitacao";
    }

    

    @PostMapping("/solicitacoes/salvar")
    public String salvarSolicitacao(
            @RequestParam String cliente,
            @RequestParam String canal,
            @RequestParam String descricao,
            @RequestParam LocalDate prazo,
            @RequestParam String responsavel,
            Model model) {

        Solicitacao solicitacao = new Solicitacao(
                cliente, canal, descricao, prazo
        );

        solicitacao.setResponsavel(responsavel);
        solicitacao.setId((long) (solicitacoes.size() + 1));

        solicitacoes.add(solicitacao);

        model.addAttribute("solicitacao", solicitacao);

        return "confirmacao";
    }

@GetMapping("/solicitacoes")
public String consultarSolicitacoes(Model model) {
    model.addAttribute("solicitacoes", solicitacoes);
    return "consultar";
}





@PostMapping("/solicitacoes/atualizar")
public String atualizarSituacao(
        @RequestParam Long id,
        @RequestParam String situacao) {

    for (Solicitacao solicitacao : solicitacoes) {
        if (solicitacao.getId().equals(id)) {
            solicitacao.setSituacao(situacao);
            break;
        }
    }

    return "redirect:/solicitacoes";
}


@GetMapping("/solicitacoes/detalhes")
public String detalhesSolicitacao(
        @RequestParam Long id,
        Model model) {

    for (Solicitacao solicitacao : solicitacoes) {
        if (solicitacao.getId().equals(id)) {
            model.addAttribute("solicitacao", solicitacao);
            return "detalhes";
        }
    }

    return "redirect:/solicitacoes";
}


}
