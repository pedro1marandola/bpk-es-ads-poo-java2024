public class Livro {
    private String titulo;
    private Autor autor;
    private String isbn;
    private int quantidadeEmEstoque;

    public Livro(String titulo, Autor autor, String isbn, int quantidadeEmEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public boolean verificarDisponibilidade() {
        return quantidadeEmEstoque > 0;
    }

    public void emprestar() {
        if (verificarDisponibilidade()) {
            quantidadeEmEstoque--;
        }
    }

    public void devolver() {
        quantidadeEmEstoque++;
    }
}
