public class TestePedido {
    public static void main(String[] args) {
        EnderecoCliente endereco = new EnderecoCliente("Cezar aug", "107", "Tocant", "Too", "PR", "00000000", true);
        Cliente cliente = new Cliente("Duda", "111112222");

        Estoque estoque = new Estoque();
        estoque.adicionarItem("Parmegiana", 6, 50.00);
        estoque.adicionarItem("Coquinha", 75, 5.00);

        Pedido pedido = new Pedido(cliente, estoque);

        Item item1 = new Item("Parmegiana", 2, 50.00);
        Item item2 = new Item("Coquinha", 2, 5.0);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        Pagamento pagamento = new Pagamento("Cartão de Crédito", 1);
        pedido.definirPagamento(pagamento);

        pedido.exibirPedido();
    }
}
