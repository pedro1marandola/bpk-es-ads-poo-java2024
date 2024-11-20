//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Cidade cidade = new Cidade("Palotina", 30000,"Paraná");
    cidade.exibirInfo();

    cidade.diminuirPopulacao(15000);
    cidade.exibirInfo();

    cidade.aumentarPopulacao(20000);
    cidade.exibirInfo();
    }
}