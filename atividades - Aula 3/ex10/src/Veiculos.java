public class Veiculos {
    private String tipo;
    private String marca;
    private String cor;

    public Veiculos(String tipo, String marca, String cor) {
        this.tipo = tipo;
        this.marca = marca;
        this.cor = cor;
    }

    public void abastecer(){
        System.out.println("O carro está abastecendo");
    }

    public void lavar(){
        System.out.println("O carro está lavando");
    }

    public void exibirInfo(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
    }
}
