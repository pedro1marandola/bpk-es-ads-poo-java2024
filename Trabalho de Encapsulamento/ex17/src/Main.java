public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Leão", 5, 190.5);

        animal.dormir();
        animal.alimentar(5.0);

        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        System.out.println("Peso: " + animal.getPeso() + " kg");

        animal.setIdade(6);
        animal.setPeso(195.5);

        System.out.println("Após um ano...");
        System.out.println("Nova idade: " + animal.getIdade() + " anos");
        System.out.println("Novo peso: " + animal.getPeso() + " kg");
    }
}
