package Entities;

public enum NivelPrioridade {

    BAIXO(1),
    MEDIO(2),
    ALTO(3),
    URGENTE(4);

    private final int codigo;

    NivelPrioridade(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void exibirDetalhes() {
        System.out.println(this.name() + " - Código: " + this.codigo);
    }

    public static void main(String[] args) {
        for (NivelPrioridade nivel : NivelPrioridade.values()) {
            nivel.exibirDetalhes();
        }
    }

}
