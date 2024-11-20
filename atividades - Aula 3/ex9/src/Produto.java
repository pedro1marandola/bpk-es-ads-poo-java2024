public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public void aumentarEstoque(int quantidade){
        if(quantidade > 0){
            quantidadeEstoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque");
        }
        else{
            System.out.println("Quanridade inválida para ser adicionada");
        }
    }
    public void diminuirEstoque(int quantidade){
        if(quantidade > 0 && quantidade <= quantidadeEstoque){
            quantidadeEstoque -= quantidade;
            System.out.println(quantidade + " unidades removida ao estoque");
        }
        else{
            System.out.println("Quantidade inválida para ser removida");
        }
    }
    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidadeEstoque);
    }

}
