package animais;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public Cachorro() {
        super();
    }

    public void fazerSom() {
        System.out.println("O cachorro está latindo!");
    }

    private void correr() {
        System.out.println("O cachorro está correndo!");
    }

    public void executarComportamentoEspecifico() {
        correr();
    }

}
