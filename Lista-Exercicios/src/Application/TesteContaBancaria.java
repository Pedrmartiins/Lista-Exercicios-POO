package Application;

import Entities.ContaBancaria;

public class TesteContaBancaria {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(10, 700.00);

        System.out.println(conta);

        conta.depositar(300.00);

        System.out.println(conta);

        conta.sacar(150.98);

        System.out.println(conta);
    }
}
