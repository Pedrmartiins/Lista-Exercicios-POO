package Entities;

public class Computador {

    private Processador processador;
    private Memoria memoria;


public Computador(Processador processador, Memoria memoria){
    this.processador = processador;
    this.memoria = memoria;

}

public void mostrarInfos(){
    System.out.println("Processador: " + processador.mostrarInfo());
    System.out.println("Memoria: " + memoria.mostrarInfo() );

}
}




