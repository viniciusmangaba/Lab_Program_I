public class Casa {
    private String endereco;
    private int numeroQuartos;
    private double areaMetrosQuadrados;

    public Casa() {
    }

    public Casa(String endereco, int numeroQuartos, double areaMetrosQuadrados) {
        this.endereco = endereco;
        this.numeroQuartos = numeroQuartos;
        this.areaMetrosQuadrados = areaMetrosQuadrados;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public double getAreaMetrosQuadrados() {
        return areaMetrosQuadrados;
    }

    public void setAreaMetrosQuadrados(double areaMetrosQuadrados) {
        this.areaMetrosQuadrados = areaMetrosQuadrados;
    }

    public void abrirPorta() {
        System.out.println("Porta da casa aberta.");
    }

    public void fecharPorta() {
        System.out.println("Porta da casa fechada.");
    }

    public void exibirDetalhes() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de Quartos: " + numeroQuartos);
        System.out.println("Área em Metros Quadrados: " + areaMetrosQuadrados);
    }

    public static void main(String[] args) {
        Casa minhaCasa = new Casa("123 Main St", 3, 150.5);

        minhaCasa.exibirDetalhes();

        minhaCasa.abrirPorta();

        minhaCasa.fecharPorta();
    }
}
