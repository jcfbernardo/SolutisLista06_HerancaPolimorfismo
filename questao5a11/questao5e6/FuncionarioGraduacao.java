package questao5a11.questao5e6;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio{
    private String universidade;
    public FuncionarioGraduacao(String nome, int codigoFuncional, String escolaBasico, String escolaMedio,String universidade){
        super(nome, codigoFuncional, escolaBasico, escolaMedio);
        this.universidade=universidade;
    }

    public String getUniversidade(){
        return universidade;
    }

    public void setUniversidade(String universidade){
        this.universidade=universidade;
    }

    public double getRendaTotal() {
        return super.getRendaTotal() *2;
    }
}
