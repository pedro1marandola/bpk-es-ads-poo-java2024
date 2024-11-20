public class Jogo {
    String nome;
    String genero;
    double preco;
    boolean emAndamento;

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
}