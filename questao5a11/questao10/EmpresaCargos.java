package questao5a11.questao10;

import questao5a11.Funcionario;
import questao5a11.Gerente;
import questao5a11.Supervisor;
import questao5a11.Vendedor;

public class EmpresaCargos {

    public static void main(String[] args) {
        int totalFuncionarios = 10;
        int numGerentes = (int) (totalFuncionarios * 0.10);
        int numSupervisores = (int) (totalFuncionarios * 0.20);
        int numVendedores = totalFuncionarios - numGerentes - numSupervisores;

        Funcionario[] funcionarios = new Funcionario[totalFuncionarios];

        for (int i = 0; i < numGerentes; i++) {
            funcionarios[i] = new Funcionario("Gerente" + (i + 1), i + 1, new Gerente());
        }
        for (int i = numGerentes; i < numGerentes + numSupervisores; i++) {
            funcionarios[i] = new Funcionario("Supervisor" + (i + 1), i + 1, new Supervisor());
        }
        for (int i = numGerentes + numSupervisores; i < totalFuncionarios; i++) {
            funcionarios[i] = new Funcionario("Vendedor" + (i + 1), i + 1, new Vendedor());
        }

        double custoTotal = 0.0;
        double custoGerentes = 0.0;
        double custoSupervisores = 0.0;
        double custoVendedores = 0.0;

        for (Funcionario funcionario : funcionarios) {
            custoTotal += funcionario.getRendaTotal();

            if (funcionario.getComissao() instanceof Gerente) {
                custoGerentes += funcionario.getRendaTotal();
            }  if (funcionario.getComissao() instanceof Supervisor) {
                custoSupervisores += funcionario.getRendaTotal();
            }  if (funcionario.getComissao() instanceof Vendedor) {
                custoVendedores += funcionario.getRendaTotal();
            }
        }

        System.out.println("Custo total da empresa: R$" + custoTotal);
        System.out.println("Custo total de Gerentes: R$" + custoGerentes);
        System.out.println("Custo total de Supervisores: R$" + custoSupervisores);
        System.out.println("Custo total de Vendedores: R$" + custoVendedores);
    }
}



