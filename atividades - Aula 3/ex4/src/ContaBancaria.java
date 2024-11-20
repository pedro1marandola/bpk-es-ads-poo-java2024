public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void deposito(double valor) {
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso!");
        }
        else{
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }
    public void sacar(double valor) {
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        }
        else{
            System.out.println("Valor inválido.");
        }
    }

    public double getSaldo(){
        return saldo;

    }

    public String getnumeroConta(){
        return numeroConta;

    }
}
