public class Filme {
    private String titulo;
    private String diretor;
    private int duracao;

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void iniciar(){
        System.out.println("O filme começou");
    }

    public void parar(){
        System.out.println("O filme foi pausada");
    }

    public void exibirInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duracao: " + duracao);
    }
}
