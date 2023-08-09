package questao5a11.questao5e6;

public class Funcionario {

    private String nome;
    private int codigoFuncional;

    private double rendaBasica = 1000;

    public Funcionario(){

    }
    public Funcionario(String nome, int codigoFuncional){
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome(){
        return nome;
    }

    public int getCodigoFuncional(){
        return codigoFuncional;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCodigoFuncional(int codigoFuncional){
        this.codigoFuncional=codigoFuncional;
    }

    public double getRendaTotal(){
        return rendaBasica;
    }
}
