public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345-6");

        conta.deposito(500.00);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        conta.sacar(200.00);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        conta.sacar(400.00);

        conta.setNumeroConta("65432-1");
        conta.setSaldo(1000.00);
        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}
