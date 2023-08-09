package animais.util;

import animais.Animal;

public class Zoologico {

    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
    }

    public void adicionarAnimal(Animal animal) {
        boolean adicionado = false;
        for (int i = 0; i < jaulas.length; i++) {
            if (jaulas[i] == null) {
                jaulas[i] = animal;
                adicionado = true;
                break;
            }
        }
        if (!adicionado) {
            System.out.println("Todas as jaulas estão ocupadas. Não é possível adicionar mais animais.\n");
        }
    }

    public void percorrerJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            Animal animal = jaulas[i];
            if (animal != null) {
                System.out.printf("Jaula %d:%n", i + 1);
                animal.fazerSom();
                animal.executarComportamentoEspecifico();
                System.out.println(); // Espaço entre animais
            }
        }
    }
}
