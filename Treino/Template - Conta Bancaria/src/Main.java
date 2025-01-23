public class Main {
    public static void main(String[] args) {
        ContaBancaria cc1 = new ContaCorrente();
        ContaBancaria cp1 = new ContaPoupanca();
        ContaBancaria cpe1 = new ContaCorrenteEstilo();

        cc1.depositar(100);
        cc1.sacar(10);
        System.out.println("Saldo da conta corrente: R$"+cc1.getSaldo());

        cp1.depositar(100);
        cp1.sacar(10);
        System.out.println("Saldo da conta poupança: R$"+cp1.getSaldo());

        cpe1.depositar(100);
        cpe1.sacar(10);
        System.out.println("Saldo da conta poupança estilo: R$"+cpe1.getSaldo());
    }
}