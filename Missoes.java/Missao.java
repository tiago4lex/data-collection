package missoes;

public class Missao {
    protected String titulo;
    protected String descricao;

    public Missao(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void iniciar() {
        System.out.println("Missão iniciada:" + titulo);
    }
    public void concluir() {
        System.out.println("Missão concluida:" + titulo);
    }
}