public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo;
    private boolean aberto;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
        this.aberto = false;
    }

    public void abrirLivro() {
        if (!aberto) {
            aberto = true;
            System.out.println("O livro \"" + titulo + "\" foi aberto.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está aberto.");
        }
    }

    public void fecharLivro() {
        if (aberto) {
            aberto = false;
            System.out.println("O livro \"" + titulo + "\" foi fechado.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está fechado.");
        }
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Tamanho do Arquivo: " + tamanhoArquivo + " MB");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public boolean isAberto() {
        return aberto;
    }
}
