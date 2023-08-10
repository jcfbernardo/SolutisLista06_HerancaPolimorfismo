package questao5a11.questao8;

public class ProgramaTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Supervisor sv = new Supervisor();
        Vendedor vd = new Vendedor();

        System.out.println(gerente.calculoDeComissao());
        System.out.println(sv.calculoDeComissao());
        System.out.println(vd.calculoDeComissao());
    }
}
