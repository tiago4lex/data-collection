package entidades;

public class Personagem {
    protected String nome;
    protected int vida;
    protected int nivel;

    public Personagem(String nome, int vida, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel
    }
    public void receberDano(int dano) {
        vida -= dano;
        System.out.println(nome + "recebeu" + dano + "de dano. Vida restante:" + vida);
    }
    public void atacar() {
        System.out.println(nome + "está atacando!");
    }
}