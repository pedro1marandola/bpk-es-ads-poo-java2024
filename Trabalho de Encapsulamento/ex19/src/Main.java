public class Main {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("O Senhor dos Anéis", "J.R.R. Tolkien", 5.0);

        livro.exibirInfo();
        livro.abrirLivro();
        livro.fecharLivro();

        livro.setTitulo("O Hobbit");
        livro.setAutor("J.R.R. Tolkien");
        livro.setTamanhoArquivo(3.5);

        livro.exibirInfo();
    }
}
