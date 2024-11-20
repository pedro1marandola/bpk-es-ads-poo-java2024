//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa("Indev Devlopment", "12.345.678/0001-90");

        minhaEmpresa.exibirInfo();

        minhaEmpresa.contratar();
        minhaEmpresa.contratar();
        minhaEmpresa.demitir();

        minhaEmpresa.exibirInfo();
    }
}