package gerenciadores;

import java.util.ArrayList;
import java.util.List;
import itens.Item;

public class GerenciadorInventario {
    private List<Item> itens;
    public GerenciadorInventario() {
        this.itens = new ArrayList<>();
    }
    public void adicionarItem( Item item) {
        itens.add(item);
        System.out.println(item.getNome() + "Adicionado ao inventário.");
    }

    public void removerItem(Item item) {
        itens.remove(item);
        System.out.println(item.getNome() + "Removido do inventário.");
    }

    public void listarItens() {
        System.out.println("Itens do inventário:");
        for (Item item : itens) {
            System.out.println("-" + item.getNome());
        }
    }
}