public class EnderecoCliente {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private boolean enderecoAtual;

    public EnderecoCliente(String rua, String numero, String bairro, String cidade, String estado, String cep, boolean enderecoAtual) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.enderecoAtual = enderecoAtual;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public boolean isEnderecoAtual() {
        return enderecoAtual;
    }

    public void setEnderecoAtual(boolean enderecoAtual) {
        this.enderecoAtual = enderecoAtual;
    }

    @Override
    public String toString() {
        return "EnderecoCliente{" +
                "rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                ", enderecoAtual=" + enderecoAtual +
                '}';
    }
}
