package animais;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public Preguica() {
        super();
    }

    public void fazerSom() {
        System.out.println("A preguiça faz: Zz Zz!");
    }

    private void subindoArvore() {
        System.out.println("A preguiça está subindo na árvore");
    }

    public void executarComportamentoEspecifico() {
        subindoArvore();
    }
}
