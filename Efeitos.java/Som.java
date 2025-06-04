package efeitos;

public class Som {
    private String arquivo;

    public Som(String arquivo) {
        this.arquivo = arquivo;
    }
    public void tocar() {
        System.out.println("Tocando som:" + arquivo);
    }
    public void parar() {
        System.out.println("Parando som:" + arquivo);
    }
}