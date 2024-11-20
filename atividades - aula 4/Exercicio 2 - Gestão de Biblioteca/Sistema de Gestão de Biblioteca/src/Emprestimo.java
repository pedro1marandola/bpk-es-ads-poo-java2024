import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Leitor leitor;
    private Date dataEmprestimo;
    public Date dataDevolucao;

    public Emprestimo(Livro livro, Leitor leitor, Date dataEmprestimo, Date dataDevolucao) {
        this.livro = livro;
        this.leitor = leitor;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
