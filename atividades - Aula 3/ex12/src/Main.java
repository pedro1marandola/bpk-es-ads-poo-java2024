//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Filme filme = new Filme("Era do Gelo", "Picotinha", 200);
    filme.exibirInfo();

    filme.iniciar();

    filme.parar();
    }
}