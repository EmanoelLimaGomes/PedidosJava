import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<EnderecoCliente> enderecos;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.enderecos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<EnderecoCliente> getEnderecos() {
        return enderecos;
    }

    public void cadastrarEndereco(EnderecoCliente endereco) {
        enderecos.add(endereco);
    }

    public void editarEndereco(int index, EnderecoCliente novoEndereco) {
        if (index >= 0 && index < enderecos.size()) {
            EnderecoCliente enderecoAtual = enderecos.get(index);
            if (enderecoAtual.isEnderecoAtual()) {
                novoEndereco.setEnderecoAtual(true);
            }
            enderecos.set(index, novoEndereco);
        } else {
            System.out.println("Endereço não encontrado.");
        }
    }

    public void removerEndereco(int index) {
        if (index >= 0 && index < enderecos.size()) {
            enderecos.remove(index);
        } else {
            System.out.println("Endereço não encontrado.");
        }
    }

    public void setEnderecoAtual(int index) {
        if (index >= 0 && index < enderecos.size()) {
            for (EnderecoCliente endereco : enderecos) {
                endereco.setEnderecoAtual(false);
            }
            enderecos.get(index).setEnderecoAtual(true);
        } else {
            System.out.println("Endereço não encontrado.");
        }
    }

    public void exibirEnderecos() {
        System.out.println("Endereços do cliente " + nome + ":");
        for (int i = 0; i < enderecos.size(); i++) {
            System.out.println((i + 1) + ". " + enderecos.get(i));
        }
    }
}