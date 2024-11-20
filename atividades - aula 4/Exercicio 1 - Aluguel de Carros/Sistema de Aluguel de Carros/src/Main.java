import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 100.00);
        Carro carro2 = new Carro("Honda", "Civic", 2021, 120.00);

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "AB123456");

        Locacao locacao1 = new Locacao(LocalDate.now(), LocalDate.now().plusDays(5), cliente1, carro1);

        System.out.println("Valor Total da Locação: R$ " + locacao1.calcularValorTotal());

        locacao1.finalizarLocacao();
        System.out.println("Carro disponível: " + carro1.isDisponivel());
    }
}
