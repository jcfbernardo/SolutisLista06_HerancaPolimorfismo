package animais.util;

import animais.Animal;

public class Veterinario {

    public void examinar(Animal animal) {
        System.out.println("Examinando o animal...");
        animal.fazerSom();
    }
}
