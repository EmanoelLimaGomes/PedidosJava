public class Pagamento {
    private String nome;
    private int qtdParcelas;


    public Pagamento(String nome, int qtdParcelas) {
        this.nome = nome;
        this.qtdParcelas = qtdParcelas;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public double calcularValorPorParcela(double valorTotal) {

        return valorTotal / qtdParcelas;
    }
}
