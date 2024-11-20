public class Main {
    public static void main(String[] args) {
        Time time = new Time("Flamengo", "Dorival Júnior");

        time.exibirInformacoes();

        time.adicionarJogador();
        time.adicionarJogador();
        time.removerJogador();

        System.out.println("Após algumas operações:");
        time.exibirInformacoes();

        time.setNome("Vasco");
        time.setTecnico("Maurício Barbieri");

        System.out.println("Após modificações:");
        time.exibirInformacoes();
    }
}
