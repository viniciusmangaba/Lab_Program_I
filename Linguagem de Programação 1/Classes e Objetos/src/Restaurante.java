public class Restaurante {
    private String nome;
    private String endereco;
    private int capacidade;

    public Restaurante() {
    }

    public Restaurante(String nome, String endereco, int capacidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void abrir() {
        System.out.println("Restaurante " + nome + " aberto.");
    }

    public void fechar() {
        System.out.println("Restaurante " + nome + " fechado.");
    }

    public void receberCliente() {
        System.out.println("Recebendo cliente no restaurante " + nome);
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Capacidade: " + capacidade + " pessoas");
    }

    public static void main(String[] args) {
        Restaurante meuRestaurante = new Restaurante("La Trattoria", "Rua das Palmeiras", 50);
        meuRestaurante.exibirDetalhes();
        meuRestaurante.abrir();
        meuRestaurante.receberCliente();
        meuRestaurante.fechar();
    }
}
