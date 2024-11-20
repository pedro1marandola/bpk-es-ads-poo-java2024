import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Autor autor1 = new Autor("George Orwell", "Britânico");
        Livro livro1 = new Livro("1984", autor1, "978-0451524935", 5);
        biblioteca.adicionarLivro(livro1);

        Autor autor2 = new Autor("J.K. Rowling", "Britânica");
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", autor2, "978-0545582889", 3);
        biblioteca.adicionarLivro(livro2);

        Leitor leitor1 = new Leitor("Ana", "12345", new Date());
        Leitor leitor2 = new Leitor("Bruno", "67890", new Date());

        System.out.println("Realizando empréstimo de '1984' para Ana:");
        if (biblioteca.realizarEmprestimo(livro1, leitor1)) {
            System.out.println("Empréstimo realizado com sucesso.");
        } else {
            System.out.println("Empréstimo não realizado. Livro indisponível.");
        }

        System.out.println("Realizando empréstimo de 'Harry Potter' para Bruno:");
        if (biblioteca.realizarEmprestimo(livro2, leitor2)) {
            System.out.println("Empréstimo realizado com sucesso.");
        } else {
            System.out.println("Empréstimo não realizado. Livro indisponível.");
        }

        System.out.println("Contando livros emprestados para Ana: " + biblioteca.contarLivrosEmprestados(leitor1));

        System.out.println("Devolvendo '1984'...");
        biblioteca.devolverLivro(livro1);

        System.out.println("Contando livros emprestados para Ana após devolução: " + biblioteca.contarLivrosEmprestados(leitor1));
    }
}

