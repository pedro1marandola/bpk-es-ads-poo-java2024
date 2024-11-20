import java.util.Date;

public class Leitor {
    private String nome;
    private String matricula;
    private Date dataNascimento;

    public Leitor(String nome, String matricula, Date dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
