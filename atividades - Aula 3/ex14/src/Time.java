public class Time {
    String nome;
    String tecnico;
    int numeroDeJogadores;

    public Time(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = 0; // Inicialmente não há jogadores
    }

    public void adicionarJogador() {
        numeroDeJogadores++;
        System.out.println("Jogador adicionado. Total de jogadores: " + numeroDeJogadores);
    }

    public void removerJogador() {
        if (numeroDeJogadores > 0) {
            numeroDeJogadores--;
            System.out.println("Jogador removido. Total de jogadores: " + numeroDeJogadores);
        } else {
            System.out.println("Não há jogadores para remover.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Time: " + nome);
        System.out.println("Técnico: " + tecnico);
        System.out.println("Número de jogadores: " + numeroDeJogadores);
    }
}