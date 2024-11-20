public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("The Witcher 3", "RPG", 199.99);

        jogo.exibirInfo();
        jogo.iniciar();
        jogo.exibirInfo();
        jogo.pausar();
        jogo.exibirInfo();

        // Alterando atributos usando setters
        jogo.setNome("The Witcher 3: Wild Hunt");
        jogo.setPreco(149.99);

        System.out.println("Após modificações:");
        jogo.exibirInfo();
    }
}
