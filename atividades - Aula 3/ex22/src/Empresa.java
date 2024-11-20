public class Empresa {
    private String nome;
    private String cnpj;
    private int numeroFuncionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numeroFuncionarios = 0;
    }

    public void contratar() {
        numeroFuncionarios++;
        System.out.println("Funcionário contratado. Número total de funcionários: " + numeroFuncionarios);
    }

    public void demitir() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
            System.out.println("Funcionário demitido. Número total de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("Não há funcionários para demitir.");
        }
    }
    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Funcionários: " + numeroFuncionarios);
    }
}
