package ex1;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = paginaAtual;
    }

    public void abrir() {
        paginaAtual = 1;
        System.out.println("O livro " + titulo + " foi aberto.");
    }

    public void lerPagina() {
        if (paginaAtual < numeroDePaginas) {
            System.out.println("Lendo a página " + paginaAtual + " do livro " + titulo + ".");
            paginaAtual++;
        } else {
            System.out.println("Você já leu todas as páginas do livro " + titulo + ".");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public int getPaginaAtual(){
        return paginaAtual;
    }
}

