package Application;

import Entities.Livros;

public class TesteLivro {
    public static void main(String[] args) {

        Livros livros = new Livros();
        livros.setAutor("Pedro");
        livros.setTitulo("O Programador");
        livros.setNumeroDePaginas(279);

        System.out.println(livros);
    }
}
