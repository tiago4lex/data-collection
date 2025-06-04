package missoes;

public class Objetivo extends Missao {
    private String alvo;

    public Objetivo(String titulo, String descricao, String alvo) {
        super(titulo, descricao);
        this.alvo = alvo;
    }
    public void mostrarAlvo() {
        System.out.println("Alvo da missão" + titulo + ":" + alvo);
    }
}