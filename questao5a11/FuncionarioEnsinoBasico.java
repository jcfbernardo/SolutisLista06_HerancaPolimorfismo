package questao5a11;


public class FuncionarioEnsinoBasico extends Funcionario{
    private String escolaBasico;


    public FuncionarioEnsinoBasico(){

    }

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional,Comissao comissao, String escolaBasico ){
        super(nome, codigoFuncional, comissao);
        this.escolaBasico=escolaBasico;

    }

    public String getEscolaBasico(){
        return escolaBasico;
    }
    public void setEscolaBasico(String escolaBasico){
        this.escolaBasico = escolaBasico;
    }

    @Override
    public double getRendaTotal() {

        return super.getRendaTotal() + (getRendaBasica()* 1.1);
    }
}
