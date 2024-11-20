public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Indev Devlopment", "12.345.678/0001-99");

        empresa.contratar();
        empresa.contratar();
        empresa.demitir();

        empresa.exibirInfo();
    }
}
