import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        BigInteger fatorialIterativo = calcularFatorialIterativo(numero);
        BigInteger fatorialRecursivo = calcularFatorialRecursivo(numero);

        System.out.println("Fatorial (Iterativo) de " + numero + " é: " + fatorialIterativo);
        System.out.println("Fatorial (Recursivo) de " + numero + " é: " + fatorialRecursivo);

        scanner.close();
    }

    public static BigInteger calcularFatorialIterativo(int n) {
        BigInteger resultado = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }

    public static BigInteger calcularFatorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(calcularFatorialRecursivo(n - 1));
    }
}
