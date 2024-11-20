public class Main {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Gourmet", 5, "Branca");

        cozinha.cozinhar();
        cozinha.limpar();

        cozinha.setTipo("Tradicional");
        cozinha.setQuantidadePessoas(10);
        cozinha.setCor("Azul");

        System.out.println("Tipo da cozinha: " + cozinha.getTipo());
        System.out.println("Quantidade de pessoas: " + cozinha.getQuantidadePessoas());
        System.out.println("Cor da cozinha: " + cozinha.getCor());
    }
}
