public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    public void correr() {
        System.out.println(nome + " está correndo!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Nome do cachorro alterado para: " + nome);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
        System.out.println("Raça do cachorro alterada para: " + raca);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
            System.out.println("Idade do cachorro alterada para: " + idade);
        } else {
            System.out.println("A idade deve ser um valor não negativo.");
        }
    }
}
