package entidades;

public class Jogador extends Personagem {
    public Jogador(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }
    public void usarHabilidadeEspecial() {
        System.out.println(nome + "usou uma habilidade especial!");
    }
}