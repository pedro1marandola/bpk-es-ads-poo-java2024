import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = scanner.nextDouble();

        double soma = num + num2;
        double subtracao = num - num2;
        double multiplicacao = num * num2;
        double divisao = num / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        if(num2 != 0){
            System.out.println("Divisao: " + divisao);
        }
        else{
            System.out.println("Não é possível dividir por zero");
        }
    }
}