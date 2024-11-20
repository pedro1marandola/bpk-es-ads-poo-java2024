public class Main {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 9.0, 6.5};
        Aluno aluno = new Aluno("Pedro", "12345", "Engenharia", notas);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Média das notas: " + aluno.mediaNotas());
        
        aluno.setNome("Lucas");
        aluno.setCurso("Computação");

        System.out.println("Nome atualizado: " + aluno.getNome());
        System.out.println("Curso atualizado: " + aluno.getCurso());
    }
}
