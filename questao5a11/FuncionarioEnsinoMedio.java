package questao5a11;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico{

    private String escolaMedio;




    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, Comissao comissao, String escolaBasico,  String escolaMedio){
        super(nome, codigoFuncional, comissao, escolaBasico);
        this.escolaMedio=escolaMedio;

    }

    public String getEscolaMedio(){
        return escolaMedio;
    }
    public void setEscolaMedio(String escolaMedio){
        this.escolaMedio = escolaMedio;
    }

    public double getRendaTotal() {
        return super.getRendaTotal() + (getRendaBasica()* 1.5);
    }
}
