//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bicicleta minhaBicicleta = new Bicicleta("Caloi", "Aro 26", 26.0);

        minhaBicicleta.pedalar();
        minhaBicicleta.frear();

        minhaBicicleta.exibirInfo();
    }
}