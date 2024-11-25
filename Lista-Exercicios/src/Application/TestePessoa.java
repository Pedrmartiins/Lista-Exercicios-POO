package Application;

import Entities.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        String nome = "Pedro";
        int idade = 20;

        Pessoa pessoa = new Pessoa(nome, idade);

        System.out.println(pessoa);
    }
}
