//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Veiculos veiculos = new Veiculos("OFF-ROAD", "Chevrolet", "Preto");

    veiculos.abastecer();
    veiculos.lavar();
    veiculos.exibirInfo();
    }
}