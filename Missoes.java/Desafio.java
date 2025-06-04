package missoes;

public class Desafio extends Missao {
    private int dificuldade;

    public Desafio(String titulo, String descricao, int dificuldade) {
        super(titulo, descricao);
        this.dificuldade = dificuldade;
    }
    public void mostrarDificuldade() {
        System.out.println("Dificuldade do desafio" + titulo + ":" + dificuldade);
    }
}