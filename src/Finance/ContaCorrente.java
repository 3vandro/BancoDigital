package Finance;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==============================");
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();

        if (this.periodo >= 1){
            System.out.println("**************");
            System.out.println(" ==Emprestimo== ");
            System.out.println(String.format("Empréstimo de R$: %.2f", super.emprestimo));
            System.out.println(String.format("Parcelas: %d", super.periodo));
            System.out.println(String.format("Saldo final de: %.2f", super.valorFinalEmprestimo));
        }

    }





}
