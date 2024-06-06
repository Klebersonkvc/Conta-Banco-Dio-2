public class ContaCorrente extends Conta {
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
}

public class ContaPoupanca extends Conta {
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
}

