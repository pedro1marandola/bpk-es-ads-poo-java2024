//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("43443-3");
        conta.deposito(10000);
        conta.sacar(435);
        System.out.println("Saldo atual: " + conta.getSaldo());
        conta.sacar(67);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}