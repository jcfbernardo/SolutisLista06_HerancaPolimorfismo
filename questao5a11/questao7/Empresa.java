package questao5a11.questao7;

import questao5a11.questao5e6.*;



public class Empresa extends Funcionario {


    public static void main(String[] args) {

        double custoTotal = 0.0;
        double custoBasico = 0.0;
        double custoMedio = 0.0;
        double custoSuperior = 0.0;

        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < funcionarios.length; i++) {
            if (i < 4) {
                funcionarios[i] = new FuncionarioEnsinoBasico("funcionario" + (i + 1), (i + 1), "Escola" + (i + 1));
                custoBasico += funcionarios[i].getRendaTotal();
            } else if (i >= 4 && i < 8) {
                funcionarios[i] = new FuncionarioEnsinoMedio("funcionario" + (i + 1), (i + 1), "Escola Basica" + (i + 1), "Escola Medio" + (i + 1));
                custoMedio += funcionarios[i].getRendaTotal();
            } else {
                funcionarios[i] = new FuncionarioGraduacao("funcionario" + (i + 1), (i + 1), "Escola Basica" + (i + 1), "Escola Medio" + (i + 1), "Universidade" + (i + 1));
                custoSuperior += funcionarios[i].getRendaTotal();
            }
            custoTotal += funcionarios[i].getRendaTotal();
        }



        System.out.println("Custo total da empresa: R$" + custoTotal);
        System.out.println("Custo total de funcionários com Ensino Básico: R$" + custoBasico);
        System.out.println("Custo total de funcionários com Ensino Médio: R$" + custoMedio);
        System.out.println("Custo total de funcionários com Nível Superior: R$" + custoSuperior);

        }
    }




