//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Professor professor = new Professor("Lucas", "Geografia", 3400);
    professor.darAula();
    professor.corrigirProvas();

    System.out.println(professor);

    Professor professor1 = new Professor("Julia", "Direito penal", 12000);
    professor1.darAula();
    professor1.corrigirProvas();
    System.out.println(professor1);
    }
}