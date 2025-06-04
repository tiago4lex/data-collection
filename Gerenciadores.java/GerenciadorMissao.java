package gerenciadores;

import java.util.ArrayList;
import java.util.List;
import missoes.Missao;

public class GerenciadorMissao {
    private List<Missao> missoesAtivas;

    public GerenciadorMissao() {
        this.missoesAtivas = new ArrayList<>();
        }

    public void AdicionarMissao(Missao missao) {
        missoesAtivas.add(missao);
        System.out.println("Missão adicionada:" + missao.getTitulo());
    }

    public void ConcluirMissao(Missao missao) {
        missoesAtivas.remove(missao);
        system.out.println("Missão concluída:" + missao.getTitulo());
    }

    public void listarMissoes() {
        System.out.println("Missões ativas:");
        for (Missao missao : missoesAtivas) {
            System.out.println("-" + missao.getTitulo());
        }
    }
}