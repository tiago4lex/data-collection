package itens;

public class Item {
    protected String nome;
    protected String descricao;

    public Item(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    public String getNome() {
        return nome;
    }
    public void usar() {
        System.out.println("Usando item:" + nome);
    }
}