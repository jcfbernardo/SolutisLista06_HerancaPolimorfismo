package questao5a11.questao8;

import questao5a11.questao5e6.*;
import questao5a11.questao7.*;

public class Comissao extends Funcionario {

    double valor;


    public Comissao(double valor) {
        this.valor = valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }



    public double calculoDeComissao() {
        return valor;
    }


}
