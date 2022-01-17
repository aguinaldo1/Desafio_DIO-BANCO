package one.dio.innovation;

public class Main {
    public static void main(String [] args){
        Cliente aguinaldo = new Cliente();
        aguinaldo.setNome("Aguinaldo");

        Conta cc = new ContaCorrente(aguinaldo);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(aguinaldo);
        cc.transferir(100,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
