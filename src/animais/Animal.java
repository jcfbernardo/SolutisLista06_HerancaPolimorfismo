package animais;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Animal() {
    }

    public void fazerSom() {
        System.out.println("O animal faz um som genérico.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void executarComportamentoEspecifico() {
        // Nenhum comportamento específico por padrão
    }

}
