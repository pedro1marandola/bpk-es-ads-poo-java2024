public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int valor) {
        if(valor > 0){
            populacao += valor;
        }
        else{
            System.out.println("O valor deve ser positivo");
        }
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Populacao: " + populacao);
        System.out.println("Estado: " + estado);
    }

    public void diminuirPopulacao(int valor) {
        if(valor > 0 && populacao > valor){
            populacao -= valor;
        }
        else{
            System.out.println("O valor deve ser positivo e menor que a população atual");
        }
    }
}
