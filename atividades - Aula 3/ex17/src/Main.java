//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal("Leão", 5, 180.0);

        meuAnimal.alimentar(5.0); // Alimenta o animal e aumenta o peso
        meuAnimal.dormir();       // Faz o animal dormir
    }
}