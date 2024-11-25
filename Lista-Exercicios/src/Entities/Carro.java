package Entities;

public class Carro implements Veiculo{

    public Carro(){

    }

    @Override
    public void mover() {
        System.out.println("O carro está se movendo com a força do motor");
    }
}
