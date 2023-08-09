package questao5a11.questao5e6;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico{

    private String escolaMedio;


    public FuncionarioEnsinoMedio(){

    }

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaBasico, String escolaMedio){
        super(nome, codigoFuncional, escolaBasico);
        this.escolaMedio=escolaMedio;

    }

    public String getEscolaMedio(){
        return escolaMedio;
    }
    public void setEscolaMedio(String escolaMedio){
        this.escolaMedio = escolaMedio;
    }

    public double getRendaTotal() {
        return super.getRendaTotal() + super.getRendaTotal()*1.5;
    }
}
