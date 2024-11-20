
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Pedro", 18, 1.81);
        pessoa1.apresentar();
        pessoa1.setAltura(1.80);
        pessoa1.setIdade(55);
        pessoa1.setNome("Luca");
        pessoa1.apresentar();

        Pessoa pessoa2 = new Pessoa("Julia", 18, 1.62);
        pessoa2.apresentar();
        pessoa2.setNome("Ana");
        pessoa2.setIdade(55);
        pessoa2.setAltura(1.40);
        pessoa2.apresentar();
    }
}
