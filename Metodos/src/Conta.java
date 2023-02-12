public class Conta {
    double saldo = 2000;

    public void sacar(double saque) {
        saldo -= saque;
        System.out.println("Seu novo saldo é: " + saldo);
    }

    public void imprimir() {
        System.out.println("O saldo é: " + saldo);
    }

    public void depositar(double deposito) {
        saldo += deposito;
        System.out.println("Seu novo saldo é: " + saldo);
    }

}
