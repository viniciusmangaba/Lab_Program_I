public class Filme {
    private String titulo;
    private String diretor;
    private int anoLancamento;
    private String genero;

    public Filme() {
    }

    public Filme(String titulo, String diretor, int anoLancamento, String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo o filme: " + titulo);
    }

    public void pausar() {
        System.out.println("Pausando o filme: " + titulo);
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Gênero: " + genero);
    }

    public static void main(String[] args) {
        Filme meuFilme = new Filme("Pulp Fiction", "Quentin Tarantino", 1994, "Crime/Drama");
        meuFilme.exibirDetalhes();
        meuFilme.reproduzir();
        meuFilme.pausar();
    }
}
