package questao5a11.questao7;

import questao5a11.questao5e6.*;

import java.util.Random;

public class Empresa extends Funcionario {
    private int contadorBasico = 0;
    private int contadorGraduacao = 0;
    private int contadorMedio = 0;
    private int custoTotal;

    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < 4; i++) {
            funcionarios[i] = new FuncionarioEnsinoBasico("funcionario" + (i + 1), (i + 1), "Escola" + (i + 1));
        }
        for (int i = 4; i < 8; i++) {
            funcionarios[i] = new FuncionarioEnsinoMedio("funcionario" + (i + 1), (i + 1), "Escola Basica" + (i + 1), "Escola Medio" + (i + 1));
        }
        for (int i = 8; i < 10; i++) {
            funcionarios[i] = new FuncionarioGraduacao("funcionario" + (i + 1), (i + 1), "Escola Basica" + (i + 1), "Escola Medio" + (i + 1), "Universidade" + (i + 1));
        }


            double custoTotal = 0.0;
            double custoBasico = 0.0;
            double custoMedio = 0.0;
            double custoSuperior = 0.0;

        for (Funcionario funcionario : funcionarios) {
            custoTotal += funcionario.getRendaTotal();

            if (funcionario instanceof FuncionarioEnsinoBasico) {
                custoBasico += funcionario.getRendaTotal();
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                custoMedio += funcionario.getRendaTotal();
            } else if (funcionario instanceof FuncionarioGraduacao) {
                custoSuperior += funcionario.getRendaTotal();
            }
        }


        System.out.println("Custo total da empresa: R$" + custoTotal);
        System.out.println("Custo total de funcionários com Ensino Básico: R$" + custoBasico);
        System.out.println("Custo total de funcionários com Ensino Médio: R$" + custoMedio);
        System.out.println("Custo total de funcionários com Nível Superior: R$" + custoSuperior);

        }
    }




