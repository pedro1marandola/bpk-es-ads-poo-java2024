import java.time.LocalDate;

public class Locacao {
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Cliente cliente;
    private Carro carro;

    public Locacao(LocalDate dataInicio, LocalDate dataFim, Cliente cliente, Carro carro) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.cliente = cliente;
        this.carro = carro;
        carro.setDisponivel(false);
    }

    public double calcularValorTotal() {
        long dias = dataInicio.until(dataFim).getDays();
        double valorBase = dias * carro.getValorPorDia();

        double taxaSeguro = 0.0; // Supondo que o seguro é opcional
        if (dias > 3) {
            taxaSeguro = 50.0; // Exemplo de taxa fixa para locações maiores que 3 dias
        }

        return valorBase + taxaSeguro;
    }

    public void finalizarLocacao() {
        carro.setDisponivel(true);
    }
}
