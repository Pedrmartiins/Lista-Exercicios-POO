package Entities;

public class Livros {
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Livros(String autor, int numeroDePaginas, String titulo) {
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.titulo = titulo;
    }

    public Livros(){
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo()
                + ", Autor: " + getAutor()
                + ", Numero de paginas: " + getNumeroDePaginas();
    }
}
