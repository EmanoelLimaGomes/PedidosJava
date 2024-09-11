import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Item> itens = new ArrayList<>();
    private Estoque estoque;
    private Pagamento pagamento;

    public Pedido(Cliente cliente, Estoque estoque) {
        this.cliente = cliente;
        this.estoque = estoque;
    }

    public void adicionarItem(Item item) {
        if (estoque.verificarDisponibilidade(item.getNome(), item.getQuantidade())) {
            itens.add(item);
            estoque.removerItem(item.getNome(), item.getQuantidade());
        } else {
            System.out.println("Item " + item.getNome() + " não está disponível em estoque.");
        }
    }

    public void definirPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(Item::calcularTotal).sum();
    }

    public void exibirPedido() {
        System.out.println("Pedido do cliente: " + cliente.getNome());
        itens.forEach(item -> System.out.println(item.getNome() + " - Qtd: " + item.getQuantidade() + " - Total: R$" + item.calcularTotal()));
        System.out.println("Total do pedido: R$" + calcularTotal());

        if (pagamento != null) {
            System.out.println(pagamento);
            System.out.println("Valor por parcela: R$" + pagamento.calcularValorPorParcela(calcularTotal()));
        }
    }

}
