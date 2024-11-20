public class Cliente {
    private String nome;
    private String cpf;
    private String carteiraHabilitacao;

    public Cliente(String nome, String cpf, String carteiraHabilitacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }
}
