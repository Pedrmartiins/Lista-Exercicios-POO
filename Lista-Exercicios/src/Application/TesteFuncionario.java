package Application;

import Entities.Funcionario;
import Entities.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João", 3000.0);
        Gerente gerente = new Gerente("Maria", 5000.0, 2000.0);

        System.out.println(funcionario.getNome() + " tem salário: R$ " + funcionario.calcularSalario());
        System.out.println(gerente.getNome() + " tem salário: R$ " + gerente.calcularSalario());
    }
}
