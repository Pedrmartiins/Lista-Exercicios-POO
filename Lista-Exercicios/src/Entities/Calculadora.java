package Entities;

public class Calculadora {
//    Crie uma classe Calculadora com métodos para somar, subtrair, multiplicar e dividir
//    dois números. Use parâmetros para passar os valores e retorne os resultados de cada
//    operação. Crie uma classe de teste para validar os cálculos.

private double valor1;
private double valor2;

    public Calculadora() {

    }

    public double soma(){
        return valor1 + valor2;
    }
    public double subtracao(){
        return valor1 - valor2;
    }
    public double multi(){
        return valor1 * valor2;
    }
    public double div(){
        return valor1 / valor2;
    }

    public void setValores(double v1, double v2) {
        valor1 = v1;
        valor2 = v2;
    }
}
