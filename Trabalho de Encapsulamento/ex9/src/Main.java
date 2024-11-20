public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Snickers", 7, 1500);
        produto.exibirInfo();

        produto.aumentarEstoque(30);
        produto.exibirInfo();

        produto.diminuirEstoque(40);
        produto.exibirInfo();

        Produto produto1 = new Produto("Absorvente masculino", 25, 70);
        produto1.exibirInfo();

        produto1.aumentarEstoque(50);
        produto1.exibirInfo();

        produto1.diminuirEstoque(90);
        produto1.exibirInfo();
    }
}
