public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome + ", Preço: R$" + preco + ", Estoque: " + estoque);
    }

    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            System.out.println("Estoque aumentado em " + quantidade + ". Novo estoque: " + estoque);
        } else {
            System.out.println("Quantidade inválida para aumento de estoque.");
        }
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Estoque diminuído em " + quantidade + ". Novo estoque: " + estoque);
        } else {
            System.out.println("Quantidade inválida para diminuição de estoque.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
