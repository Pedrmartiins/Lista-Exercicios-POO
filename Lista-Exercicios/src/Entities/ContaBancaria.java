package Entities;

public class ContaBancaria {

    private double saldo;
    private int numero;

    public ContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }
    public void sacar(double saldo) {
        this.saldo -= saldo;
    }

    @Override
    public String toString() {
        return "Numero da conta: " + getNumero() + " Saldo: " + getSaldo();
    }
}
