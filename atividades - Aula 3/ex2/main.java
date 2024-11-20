package ex2;

class Main {
    public static void main(String[] args) {
        Celular meuCelular = new Celular("Samsung", "Galaxy S21", 4000);
        System.out.println(meuCelular);
        meuCelular.ligar();
        meuCelular.desligar();
    }
}
