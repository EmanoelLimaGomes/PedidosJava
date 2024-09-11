import java.util.ArrayList;
import java.util.List;
public class Estoque {
    private List<Item> estoque = new ArrayList<>();

    public void adicionarItem(String nome, int quantidade, double preco) {
        for (Item item : estoque) {
            if (item.getNome().equals(nome)) {
                item.quantidade += quantidade;
                return;
            }
        }
        estoque.add(new Item(nome, quantidade, preco));
    }

    public boolean verificarDisponibilidade(String nome, int quantidade) {
        for (Item item : estoque) {
            if (item.getNome().equals(nome)) {
                return item.quantidade >= quantidade;
            }
        }
        return false;
    }

    public void removerItem(String nome, int quantidade) {
        for (Item item : estoque) {
            if (item.getNome().equals(nome) && item.quantidade >= quantidade) {
                item.quantidade -= quantidade;
                return;
            }
        }
    }

    public double getPreco(String nome) {
        for (Item item : estoque) {
            if (item.getNome().equals(nome)) {
                return item.getPreco();
            }
        }
        return 0.0;
    }
}