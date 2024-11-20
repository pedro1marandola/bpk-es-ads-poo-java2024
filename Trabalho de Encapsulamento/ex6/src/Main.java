public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador("i7 - 10g", "16gb", "1tb");

        computador.ligar();
        computador.ligar();
        computador.desligar();
        computador.desligar();

        System.out.println("Computador foi ligado e logo após foi desligado.");
        System.out.println("  --------------");
        System.out.println("| Especificações |");
        System.out.println("  --------------");
        System.out.println("Processador: " + computador.getProcessador());
        System.out.println("Memória RAM: " + computador.getMemoriaRam());
        System.out.println("Armazenamento: " + computador.getArmazenamento());

        computador.setArmazenamento("500gb");
        computador.setProcessador("Ryzen 5 3600g");
        computador.setMemoriaRam("8gb");

        System.out.println("Computador foi atualizado.");
        System.out.println("  --------------");
        System.out.println("| Especificações |");
        System.out.println("  --------------");
        System.out.println("Processador: " + computador.getProcessador());
        System.out.println("Memória RAM: " + computador.getMemoriaRam());
        System.out.println("Armazenamento: " + computador.getArmazenamento());
    }
}
