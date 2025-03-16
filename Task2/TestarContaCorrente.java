package Task2;

class ContaCorrente 
{
    double saldo;

    void definirSaldoInicial(double valor)
    {
        saldo = valor;
    }
    void depositar(double valor)
    // Incremento
    {
        saldo += valor;
    }
    // Decremento
    void sacar(double valor)
    {
        saldo -= valor;
    }
}

public class TestarContaCorrente
{
    public static void main(String[] agrs)
    {
        ContaCorrente novaContaCorrente = new ContaCorrente();

        novaContaCorrente.definirSaldoInicial(1000);
        System.out.println("Saldo inicial: " + novaContaCorrente.saldo);

        novaContaCorrente.sacar(500);
        novaContaCorrente.depositar(50);
        System.out.println("Saldo depois de saque e deposito: " + novaContaCorrente.saldo);

        novaContaCorrente.sacar(600);
        System.out.println("Saldo atual: " + novaContaCorrente.saldo);
    }
}