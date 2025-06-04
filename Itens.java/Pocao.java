package itens;

public class Pocao extends Item {
    private int cura;

    public Pocao(String nome, String descricao, int cura) {
        super(nome, descricao);
        this.cura = cura;
    }
    public void beber() {
        System.out.println("Bebendo poção" + nome + ", recuperando" + cura + "de vida.");
    }
}