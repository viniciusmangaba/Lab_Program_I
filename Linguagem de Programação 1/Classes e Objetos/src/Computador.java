public class Computador {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String processador;

    public Computador() {
    }

    public Computador(String marca, String modelo, int anoFabricacao, String processador) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.processador = processador;
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

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void ligar() {
        System.out.println("O computador está ligado.");
    }

    public void desligar() {
        System.out.println("O computador está desligado.");
    }

    public void executarPrograma(String programa) {
        System.out.println("Executando o programa: " + programa);
    }

    public void navegarInternet() {
        System.out.println("Navegando na Internet.");
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Processador: " + processador);
    }

    public static void main(String[] args) {
        Computador meuComputador = new Computador("Dell", "XPS 15", 2022, "Intel i7");

        meuComputador.exibirDetalhes();

        meuComputador.ligar();

        meuComputador.executarPrograma("Microsoft Word");

        meuComputador.navegarInternet();
    }
}
