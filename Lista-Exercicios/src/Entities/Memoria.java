package Entities;

public class Memoria {
    private String tipoDeMemoria;
    private int capacidade;

    public Memoria(int capacidade, String tipoDeMemoria) {
        this.capacidade = capacidade;
        this.tipoDeMemoria = tipoDeMemoria;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipoDeMemoria() {
        return tipoDeMemoria;
    }

    public void setTipoDeMemoria(String tipoDeMemoria) {
        this.tipoDeMemoria = tipoDeMemoria;
    }

    public String mostrarInfo(){
        return "Tipo de memoria: " + getTipoDeMemoria() +
     ", Capacidade: " + getCapacidade()+ "gb";
    }
}
