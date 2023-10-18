public class Relogio {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String tipoExibicao;

    public Relogio() {
    }

    public Relogio(String marca, String modelo, int anoFabricacao, String tipoExibicao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.tipoExibicao = tipoExibicao;
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

    public String getTipoExibicao() {
        return tipoExibicao;
    }

    public void setTipoExibicao(String tipoExibicao) {
        this.tipoExibicao = tipoExibicao;
    }

    public void exibirHora() {
        System.out.println("Exibindo a hora no formato " + tipoExibicao);
    }

    public void ajustarHora(int horas, int minutos) {
        System.out.println("Ajustando a hora para " + horas + ":" + minutos);
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Tipo de Exibição: " + tipoExibicao);
    }

    public static void main(String[] args) {
        Relogio meuRelogio = new Relogio("Casio", "G-Shock", 2023, "Analógico-Digital");

        meuRelogio.exibirDetalhes();

        meuRelogio.exibirHora();

        meuRelogio.ajustarHora(10, 30);
    }
}
