package entidades;

public class Monstro extends Personagem {
        public Monstro(String nome, int vida, int nivel) {
            super(nome, vida, nível);
        }
        public void rugir() {
            System.out.println(nome + "Está rugindo ferozmente!");
        }
}