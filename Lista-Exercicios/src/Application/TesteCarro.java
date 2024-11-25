package Application;

import Entities.Bicicleta;
import Entities.Carro;

public class TesteCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Bicicleta bike = new Bicicleta();

        carro.mover();
        bike.mover();

    }
}
