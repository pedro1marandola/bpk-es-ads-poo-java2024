public class Cozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;
    private boolean emUso;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
        this.emUso = false;
    }

    public void cozinhar() {
        if (!emUso) {
            emUso = true;
            System.out.println("Cozinhando na cozinha de tipo " + tipo + ".");
        } else {
            System.out.println("A cozinha já está em uso.");
        }
    }

    public void limpar() {
        if (emUso) {
            emUso = false;
            System.out.println("A cozinha foi limpa.");
        } else {
            System.out.println("A cozinha já está limpa.");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEmUso() {
        return emUso;
    }
}
