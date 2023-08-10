package questao5a11.questao11;

import questao5a11.Funcionario;
import questao5a11.FuncionarioEnsinoBasico;
import questao5a11.FuncionarioEnsinoMedio;
import questao5a11.FuncionarioGraduacao;
import questao5a11.Comissao;
import questao5a11.Gerente;
import questao5a11.Supervisor;
import questao5a11.Vendedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmpresaMisto {

    public static void main(String[] args) {

        double custoTotal = 0.0;
        double custoBasico = 0.0;
        double custoMedio = 0.0;
        double custoSuperior = 0.0;

        Funcionario[] funcionarios = new Funcionario[10];
        Random random = new Random();

        List<Comissao> comissoesVendedor = new ArrayList<>();
        List<Comissao> comissoesSupervisor = new ArrayList<>();
        List<Comissao> comissoesGerente = new ArrayList<>();

        comissoesVendedor.add(new Vendedor());
        comissoesSupervisor.add(new Supervisor());
        comissoesGerente.add(new Gerente());

        int numVendedores = (int) Math.ceil(funcionarios.length * 0.7);
        int numSupervisores = (int) Math.ceil(funcionarios.length * 0.2);
        int numGerentes = funcionarios.length - numVendedores - numSupervisores;

        int numEnsinoBasico = (int) Math.ceil(funcionarios.length * 0.4);
        int numEnsinoMedio = (int) Math.ceil(funcionarios.length * 0.4);
        int numNivelSuperior = funcionarios.length - numEnsinoBasico - numEnsinoMedio;

        int gerentesAssigned = 0;
        int supervisoresAssigned = 0;
        int vendedoresAssigned = 0;

        int ensinoBasicoAssigned = 0;
        int ensinoMedioAssigned = 0;
        int nivelSuperiorAssigned = 0;

        for (int i = 0; i < funcionarios.length; i++) {
            Comissao selectedComissao;

            if (gerentesAssigned < numGerentes) {
                selectedComissao = comissoesGerente.get(gerentesAssigned % comissoesGerente.size());
                gerentesAssigned++;
            } else if (supervisoresAssigned < numSupervisores) {
                selectedComissao = comissoesSupervisor.get(supervisoresAssigned % comissoesSupervisor.size());
                supervisoresAssigned++;
            } else {
                selectedComissao = comissoesVendedor.get(vendedoresAssigned % comissoesVendedor.size());
                vendedoresAssigned++;
            }

            if (ensinoBasicoAssigned < numEnsinoBasico) {
                funcionarios[i] = new FuncionarioEnsinoBasico("Funcionario " + (i + 1), (i + 1), selectedComissao, "Escola" + (i + 1));
                custoBasico += funcionarios[i].getRendaTotal();
                ensinoBasicoAssigned++;
            } else if (ensinoMedioAssigned < numEnsinoMedio) {
                funcionarios[i] = new FuncionarioEnsinoMedio("Funcionario " + (i + 1), (i + 1), selectedComissao, "Escola Basica" + (i + 1), "Escola Medio" + (i + 1));
                custoMedio += funcionarios[i].getRendaTotal();
                ensinoMedioAssigned++;
            } else {
                funcionarios[i] = new FuncionarioGraduacao("Funcionario " + (i + 1), (i + 1), selectedComissao, "Escola" + (i + 1), "Escola Medio" + (i + 1), "Universidade" + (i + 1));
                custoSuperior += funcionarios[i].getRendaTotal();
                nivelSuperiorAssigned++;
            }

            custoTotal += funcionarios[i].getRendaTotal();
            System.out.println(funcionarios[i].toString());
        }

        System.out.println("Custo total da empresa: R$" + custoTotal);
        System.out.println("Custo total de funcionários com Ensino Básico: R$" + custoBasico);
        System.out.println("Custo total de funcionários com Ensino Médio: R$" + custoMedio);
        System.out.println("Custo total de funcionários com Nível Superior: R$" + custoSuperior);
    }
}
