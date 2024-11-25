package Entities;

public class Pessoa {
//    Implemente uma classe Pessoa com atributos nome e idade. Crie um construtor que
//    receba esses atributos como parâmetros e inicialize-os. Crie uma classe TestePessoa para
//    instanciar objetos e exibir suas informações.


    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade();
    }
}
