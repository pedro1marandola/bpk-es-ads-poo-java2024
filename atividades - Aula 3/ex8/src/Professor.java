public class Professor {
    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }
    public void darAula(){
        System.out.println("O professor " + nome + " está dando aula");

    }
    public void corrigirProvas(){
        System.out.println("O professor " + nome + " está corrigindo as provas");
    }
    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nDisciplina: " + disciplina
                + "\nSalario: " + salario;
    }
}

