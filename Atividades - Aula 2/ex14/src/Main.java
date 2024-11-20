import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        int contagemVogais = 0;

        for (char c : frase.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                contagemVogais++;
            }
        }

        System.out.println("Número de vogais na frase: " + contagemVogais);

        scanner.close();
    }
}
