public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja("Supermercado XYZ", "Rua das Flores, 123", "1234-5678");

        loja.abrirLoja();
        loja.fecharLoja();
        loja.fecharLoja();

        System.out.println("Nome da loja: " + loja.getNome());
        System.out.println("Endereço da loja: " + loja.getEndereco());
        System.out.println("Telefone da loja: " + loja.getTelefone());
        System.out.println("A loja está aberta? " + (loja.isAberta() ? "Sim" : "Não"));
    }
}
