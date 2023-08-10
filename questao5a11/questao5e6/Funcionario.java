package questao5a11.questao5e6;

import questao5a11.questao8.Comissao;

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
                "Código Funcional: " + codigoFuncional + "\n" +
                "Renda Total: " + getRendaTotal();
    }
}

