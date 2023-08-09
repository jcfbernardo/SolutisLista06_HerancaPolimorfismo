package animais;

import animais.util.Veterinario;
import animais.util.Zoologico;

public class Main {
    static void emitirSomDoAnimal(Animal animal) {
        animal.fazerSom();
    }

    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 3);
        Animal cavalo = new Cavalo("Relâmpago", 5);
        Animal preguica = new Preguica("Soninho", 2);

        emitirSomDoAnimal(cachorro);
        emitirSomDoAnimal(cavalo);
        emitirSomDoAnimal(preguica);

        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        Zoologico zoologico = new Zoologico();

        zoologico.adicionarAnimal(cachorro);
        zoologico.adicionarAnimal(cavalo);
        zoologico.adicionarAnimal(preguica);

        zoologico.adicionarAnimal(new Cachorro("Fido", 2));
        zoologico.adicionarAnimal(new Cavalo("Trovoada", 4));
        zoologico.adicionarAnimal(new Preguica("Preguiçoso", 3));
        zoologico.adicionarAnimal(new Cachorro("Max", 1));
        zoologico.adicionarAnimal(new Cavalo("Estrela", 6));
        zoologico.adicionarAnimal(new Preguica("Soneca", 4));
        zoologico.adicionarAnimal(new Cachorro("Buddy", 2));

        zoologico.percorrerJaulas();

        zoologico.adicionarAnimal(new Cavalo("Potranca", 3)); // overflow do array
    }
}