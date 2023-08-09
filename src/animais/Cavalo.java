package animais;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public Cavalo() {
        super();
    }

    public void fazerSom() {
        System.out.println("O cavalo está relinchando!");
    }

    private void correr() {
        System.out.println("O cavalo está correndo!");
    }

    public void executarComportamentoEspecifico() {
        correr();
    }
}
