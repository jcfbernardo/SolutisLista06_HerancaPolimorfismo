package questao5a11;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio{
    private String universidade;
    public FuncionarioGraduacao(String nome, int codigoFuncional, Comissao comissao, String escolaBasico, String escolaMedio, String universidade){
        super(nome, codigoFuncional, comissao, escolaBasico, escolaMedio);
        this.universidade=universidade;
    }

    public String getUniversidade(){
        return universidade;
    }

    public void setUniversidade(String universidade){
        this.universidade=universidade;
    }

    public double getRendaTotal() {
        return super.getRendaTotal() + getRendaBasica();
    }

}
