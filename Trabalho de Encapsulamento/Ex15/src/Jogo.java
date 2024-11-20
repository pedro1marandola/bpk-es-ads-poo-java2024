public class Jogo {
    private String nome;
    private String genero;
    private double preco;
    private boolean emAndamento;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.emAndamento = false;
    }

    public void iniciar() {
        if (!emAndamento) {
            emAndamento = true;
            System.out.println("O jogo " + nome + " foi iniciado.");
        } else {
            System.out.println("O jogo já está em andamento.");
        }
    }

    public void pausar() {
        if (emAndamento) {
            emAndamento = false;
            System.out.println("O jogo " + nome + " foi pausado.");
        } else {
            System.out.println("O jogo já está pausado.");
        }
    }

    public void exibirInfo() {
        System.out.println("Nome do jogo: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Em andamento: " + (emAndamento ? "Sim" : "Não"));
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isEmAndamento() {
        return emAndamento;
    }

    // Setter para alterar o estado de 'emAndamento' diretamente não é recomendado,
    // mas se necessário, você pode criar um método para manipular isso.
}
