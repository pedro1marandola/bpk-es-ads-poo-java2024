public class Main {
    public static void main(String[] args) {
        Veiculos carro = new Veiculos("Carro", "Toyota", "Vermelho");

        carro.exibirInfo();
        carro.abastecer();
        carro.lavar();

        carro.setCor("Azul");
        carro.setMarca("Honda");

        System.out.println("Após modificações:");
        carro.exibirInfo();
    }
}
