public class Bicicleta {
    private String marca;
    private String modelo;
    private double tamanhoRoda;
    private boolean emMovimento;

    public Bicicleta(String marca, String modelo, double tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
        this.emMovimento = false;
    }

    public void pedalar() {
        if (!emMovimento) {
            emMovimento = true;
            System.out.println("A bicicleta está em movimento.");
        } else {
            System.out.println("A bicicleta já está em movimento.");
        }
    }

    public void frear() {
        if (emMovimento) {
            emMovimento = false;
            System.out.println("A bicicleta parou.");
        } else {
            System.out.println("A bicicleta já está parada.");
        }
    }
    public void exibirInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamanho Roda: " + tamanhoRoda);
    }
}
