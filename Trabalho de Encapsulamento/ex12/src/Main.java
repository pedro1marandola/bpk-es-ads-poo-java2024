public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Inception", "Christopher Nolan", 148);

        filme.exibirInfo();
        filme.iniciar();
        filme.parar();

        filme.setTitulo("Interstellar");
        filme.setDiretor("Christopher Nolan");
        filme.setDuracao(169);

        System.out.println("Após modificações:");
        filme.exibirInfo();
    }
}
