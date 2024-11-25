package Entities;

public class Loja {

        public double calcularPreco(double precoBase, int quantidade) {
            return precoBase * quantidade;
        }

        public double calcularPreco(double precoBase, int quantidade, double descontoPercentual) {
            double precoTotal = precoBase * quantidade;
            double desconto = precoTotal * (descontoPercentual / 100);
            return precoTotal - desconto;
        }

        public static void main(String[] args) {
            Loja loja = new Loja();
            double preco1 = loja.calcularPreco(100.0, 5);
            double preco2 = loja.calcularPreco(100.0, 5, 10.0);

            System.out.println("Preço sem desconto: R$ " + preco1);
            System.out.println("Preço com desconto: R$ " + preco2);
        }
    }

