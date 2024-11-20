//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Aventura Mística", "Aventura", 59.99);

        jogo.exibirInfo();

        jogo.iniciar();
        jogo.pausar();

        jogo.exibirInfo();
    }
}