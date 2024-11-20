public class Main {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("São Paulo", 12300000, "SP");

        cidade.exibirInfo();

        cidade.aumentarPopulacao(5000);
        System.out.println("Após aumento:");
        cidade.exibirInfo();

        cidade.diminuirPopulacao(3000);
        System.out.println("Após diminuição:");
        cidade.exibirInfo();

        cidade.setNome("Rio de Janeiro");
        cidade.setEstado("RJ");

        System.out.println("Após modificações:");
        cidade.exibirInfo();
    }
}
