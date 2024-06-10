package Finance;

public abstract class Conta implements IConta {
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia  = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;

    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    @Override
    public void depositar(double valor) {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
