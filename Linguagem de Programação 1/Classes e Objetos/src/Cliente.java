public class Cliente {
    private String nome;
    private String sobrenome;
    private int idade;
    private String endereco;

    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, int idade, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void fazerPedido() {
        System.out.println(nome + " fazendo um pedido.");
    }

    public void pagarConta() {
        System.out.println(nome + " pagando a conta.");
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
    }

    public static void main(String[] args) {
        // Criar um objeto da classe "Cliente"
        Cliente meuCliente = new Cliente("João", "Silva", 30, "Rua das Palmeiras");

        // Exibir detalhes do cliente
        meuCliente.exibirDetalhes();

        // Fazer um pedido
        meuCliente.fazerPedido();

        // Pagar a conta
        meuCliente.pagarConta();
    }
}
