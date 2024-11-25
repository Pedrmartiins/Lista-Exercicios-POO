package Application;

import Entities.Calculadora;

import java.util.Scanner;

public class TesteCalc {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        while (continuar) {
            System.out.println("Digite o primeiro número:");
            double v1 = sc.nextDouble();
            System.out.println("Digite o segundo número:");
            double v2 = sc.nextDouble();

            calc.setValores(v1, v2);

            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");

            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("A soma dos dois números é: " + calc.soma());
                    break;
                case 2:
                    System.out.println("A subtração dos dois números é: " + calc.subtracao());
                    break;
                case 3:
                    System.out.println("A multiplicação dos dois números é: " + calc.multi());
                    break;
                case 4:
                    if (v2 == 0) {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    } else {
                        System.out.printf("A divisão dos dois números é: %.2f\n", calc.div());
                    }
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close();
    }
}
