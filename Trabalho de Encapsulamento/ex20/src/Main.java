public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Aro 29", 29.0);

        bicicleta.exibirInfo();
        bicicleta.pedalar();
        bicicleta.frear();

        bicicleta.setMarca("Shimano");
        bicicleta.setModelo("Aro 27");
        bicicleta.setTamanhoRoda(27.0);

        bicicleta.exibirInfo();
    }
}
