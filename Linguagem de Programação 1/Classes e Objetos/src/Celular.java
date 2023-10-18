public class Celular {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String sistemaOperacional;

    public Celular() {
    }

    public Celular(String marca, String modelo, int anoFabricacao, String sistemaOperacional) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.sistemaOperacional = sistemaOperacional;
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

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void fazerLigacao(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem: " + mensagem);
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Sistema Operacional: " + sistemaOperacional);
    }

    public static void main(String[] args) {
        // Criar um objeto da classe "Celular"
        Celular meuCelular = new Celular("Samsung", "Galaxy S20", 2022, "Android");

        meuCelular.exibirDetalhes();

        meuCelular.fazerLigacao("123-456-7890");

        meuCelular.enviarMensagem("Olá, como vai?");
    }
}
