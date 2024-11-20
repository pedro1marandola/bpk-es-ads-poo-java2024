public class Pessoa {
    private String nome;
    private int idade;
    private double altura; // em metros

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + ", tenho " + idade + " anos e " + altura + " metros de altura.");
    }
}
