package Application;

import Entities.Computador;
import Entities.Memoria;
import Entities.Processador;

public class TesteComputador {

    public static void main(String[] args) {
        Processador processador = new Processador("Ryzen 7", 12, 4.1 );
        Memoria memoria = new Memoria(32, "ram");

        Computador computador = new Computador(processador, memoria);

        computador.mostrarInfos();
    }
}

