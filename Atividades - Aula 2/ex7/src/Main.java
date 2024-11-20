public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int resultado = soma(num1, num2);

        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + resultado);
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
