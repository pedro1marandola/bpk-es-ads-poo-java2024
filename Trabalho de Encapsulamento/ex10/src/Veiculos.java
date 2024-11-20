public class Veiculos {
    private String tipo;
    private String marca;
    private String cor;

    public Veiculos(String tipo, String marca, String cor) {
        this.tipo = tipo;
        this.marca = marca;
        this.cor = cor;
    }

    public void abastecer() {
        System.out.println("O " + tipo + " está abastecendo.");
    }

    public void lavar() {
        System.out.println("O " + tipo + " está lavando.");
    }

    public void exibirInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
