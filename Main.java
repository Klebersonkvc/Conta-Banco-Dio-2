
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("João");

        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
