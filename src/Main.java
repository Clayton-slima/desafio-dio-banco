public class Main {

    public static void main(String[] args) {

        Cliente Clayton = new Cliente();
        Clayton.setNome("Clayton");

        Conta cc = new ContaCorrente(Clayton);
        Conta poupanca = new ContaPoupanca(Clayton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
