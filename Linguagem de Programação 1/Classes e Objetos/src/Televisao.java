public class Televisao {
    private String marca;
    private String modelo;
    private int tamanhoPolegadas;

    public Televisao() {
    }

    public Televisao(String marca, String modelo, int tamanhoPolegadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public void setTamanhoPolegadas(int tamanhoPolegadas) {
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public void ligar() {
        System.out.println("A televisão está ligada.");
    }

    public void desligar() {
        System.out.println("A televisão está desligada.");
    }

    public void ajustarVolume(int volume) {
        System.out.println("Volume ajustado para " + volume);
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamanho em Polegadas: " + tamanhoPolegadas);
    }

    public static void main(String[] args) {
        Televisao minhaTV = new Televisao("LG", "Smart TV", 55);

        minhaTV.exibirDetalhes();

        minhaTV.ligar();

        minhaTV.ajustarVolume(30);
    }
}
