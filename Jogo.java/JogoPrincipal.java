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
        Pocao pocao = new 
       }
}