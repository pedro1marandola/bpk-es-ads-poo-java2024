//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Aluno aluno = new Aluno("Joao", "353424", "ADS", new double[]{50, 68, 40, 64});
        aluno.mediaNotas();
        System.out.println("A media de notas do aluno " + aluno + " é " + aluno.mediaNotas());
    }
}