package entidades;

public class NPC extends Personagem {
    public NPC(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }
    public void interagir() `{
        System.out.println(nome + "Está interagindo com o jogador.");
    }
}
