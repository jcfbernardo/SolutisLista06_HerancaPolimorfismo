package questao5a11.questao5e6;


public class FuncionarioEnsinoBasico extends Funcionario{
    private String escolaBasico;


    public FuncionarioEnsinoBasico(){

    }

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaBasico){
        super(nome, codigoFuncional);
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

        return super.getRendaTotal() * 1.1;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Escola Básico: " + escolaBasico;
    }
}
