package gerenciadores;

public class GerenciadorMapa {
    private String mapaAtual;

    public GerenciadorMapa(String mapaInicial) {
        this.mapaAtual = mapaInicial
    }
    public void mudarMapa(String novoMapa) {
        System.out.println("Mudando de" + mapaAtual + "para" + novoMapa);
        mapaAtual = novoMapa;
    }
    public String getMapaAtual() {
        return mapaAtual;
    }

}