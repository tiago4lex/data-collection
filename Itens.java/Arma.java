package itens;

public class Arma extends Item {
    private int dano;

    public Arma(String nome, String descricao, int dano) {
        super(nome, descricao);
        this.dano = dano;
    }
    public void atacar() {
        SYstem.out.println("Atacando com:" + nome + ", causando" + dano + "de dano.");
    }
}