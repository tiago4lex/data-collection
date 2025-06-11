package jogo;

import entidades.Jogador;
import entidades.NPC;
import itens.Arma;
import gerenciadores.GerenciadorInventario;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Lucas", 100, 1);
        NPC comerciante = new NPC("Comerciante", 80, 1);
        Arma espada = new Arma("Espada de fogo", "Causa dano de fogo", 25);

        GerenciadorInventario inventario = new GerenciadorInventario();
        inventario.adicionarItem(espada);

        jogador.usarHabilidadeEspecial();
        comerciante.interagir();
        inventario.listarItens();
    }
}