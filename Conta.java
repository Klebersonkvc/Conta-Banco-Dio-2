
public abstract class Conta {
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = 1; // agência padrão para todas as contas
        this.numero = SEQUENCIAL++;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
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

    public abstract void imprimirExtrato();
}
