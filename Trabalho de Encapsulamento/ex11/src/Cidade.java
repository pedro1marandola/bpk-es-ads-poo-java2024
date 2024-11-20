public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int valor) {
        if (valor > 0) {
            populacao += valor;
        } else {
            System.out.println("O valor deve ser positivo.");
        }
    }

    public void diminuirPopulacao(int valor) {
        if (valor > 0 && populacao > valor) {
            populacao -= valor;
        } else {
            System.out.println("O valor deve ser positivo e menor que a população atual.");
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("População: " + populacao);
        System.out.println("Estado: " + estado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
