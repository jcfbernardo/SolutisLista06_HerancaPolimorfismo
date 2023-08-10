package questao5a11;

import questao5a11.Comissao;

public class Funcionario {

    private String nome;
    private int codigoFuncional;

    private double rendaBasica = 1000;

    private Comissao comissao;

    public Funcionario() {

    }

    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public Funcionario(String nome, int codigoFuncional) {
    }

    public double getRendaBasica() {
        return rendaBasica;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double getRendaTotal() {
        return rendaBasica + comissao.calculoDeComissao();
    }

    public Comissao getComissao() {
        return comissao;
    }
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Renda Total: " + getRendaTotal()+ "\n" +
                "Comissão: " + comissao.calculoDeComissao();
    }
}

