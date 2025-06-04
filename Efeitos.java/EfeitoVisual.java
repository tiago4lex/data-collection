package efeitos;

public class EfeitoVisual {
    private String nome;

    public EfeitoVisual (String nome) {
        this.nome = nome;
    }
    public void exibir() {
        System.out.println("Exibindo efeito visual:" + nome);
    }
}