package Entities;

public class Processador {
    private String modelo;
    private double velocidade;
    private double nucleos;

    public Processador(String modelo, double nucleos, double velocidade) {
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getNucleos() {
        return nucleos;
    }

    public void setNucleos(double nucleos) {
        this.nucleos = nucleos;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String mostrarInfo() {
        return "Modelo: " + getModelo() + ", Velocidade: " + getVelocidade() +
                ", Nucleos: " + getNucleos();

    }
}
