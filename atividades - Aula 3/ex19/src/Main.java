//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LivroDigital meuLivro = new LivroDigital("Carburador", "Stephen Hawking", 1.5);

        meuLivro.abrirLivro();
        meuLivro.fecharLivro();

        meuLivro.exibirInfo();
    }
}