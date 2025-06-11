package jogo;

import entidades.Jogador;
import entidades.Monstro;
import efeitos.Som;
import efeitos.EfeitoVisual;
import gerenciadores.*;
import itens.Arma;
import itens.Pocao;
import itens.Armadura;
import missoes.Desafio;
import missoes.Objetivo;

public class JogoPrincipal {
    public static void main(String[] args) {
        GerenciadorJogo GerenciadorJogo = new GerenciadorJogo();
        GerenciadorJogo.iniciarJogo();

        Jogador jogador = new Jogador("Lucas", 100, 5);
        Monstro monstro = new Monstro("Dragão", 200, 10);

        Arma espada = new Arma("Espada flamejante", "Causa muito dano", 50);
        Armadura armadura = new Armadura ("Armadura de ferro", "Protege muito bem", 30);
        Pocao pocao = new Pocao("Poção de vida", "Cura 50 de vida", 50);

        GerenciadorInventario inventario = new GerenciadorInventario();
        inventario.adicionarItem(espada);
        inventario.adicionarItem(armadura);
        inventario.adicionarItem(pocao);

        GerenciadorMapa mapa = new GerenciadorMapa("Cidade inicial");
        mapa.mudarMapa("Floresta sombria");

        GerenciadorMissao missoes = new GerenciadorMissao();
        Desafio desafio = new Desafio("Derrote o Dragão", "Enfrente o dragão na caverna", 5);
        Objetivo Objetivo = new Objetivo("Explore a floresta", "Encontre a árvore mágica", "Árvore mágica");
        missoes.adicionarMissao(desafio);
        missoes.adicionarMissao(objetivo);

        jogador.atacar();
        espada.atacar();
        monstro.receberDano(50);

        pocao.beber();

        EfeitoVisual efeito = new EfeitoVisual("Explosão");
        efeito.exibir();

        Som som = new Som("batalha.mp3");
        som.tocar();
        som.parar();

        missoes.listarMissoes();
        inventario.listarItens();

        GerenciadorJogo.encerrarJogo();
       }
}