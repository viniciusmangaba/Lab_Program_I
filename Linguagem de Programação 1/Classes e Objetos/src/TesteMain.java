public class TesteMain {
    public static void main(String[] args) {

        // CLASSE CARRO
        Carro carro1 = new Carro("FIAT", "UNO", 2002, "ABC123");

        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano de Fabricação: " + carro1.getAnoFabricacao());
        System.out.println("Placa: " + carro1.getPlaca());
        carro1.ligar();
        carro1.acelerar();
        carro1.frear();
        carro1.desligar();

        //CLASSE COMPUTADOR
        Computador meuComputador = new Computador("Dell", "XPS 15", 2022, "Intel i7");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Marca: " + meuComputador.getMarca());
        System.out.println("Modelo: " + meuComputador.getModelo());
        System.out.println("Ano de Fabricação: " + meuComputador.getAnoFabricacao());
        System.out.println("Processador: " + meuComputador.getProcessador());
        meuComputador.ligar();
        meuComputador.executarPrograma("Microsoft Word");
        meuComputador.navegarInternet();
        meuComputador.desligar();

        //CLASSE RELÓGIO
        Relogio meuRelogio = new Relogio("Casio", "G-Shock", 2023, "Analógico-Digital");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Marca: " + meuRelogio.getMarca());
        System.out.println("Modelo: " + meuRelogio.getModelo());
        System.out.println("Ano de Fabricação: " + meuRelogio.getAnoFabricacao());
        System.out.println("Tipo de Exibição: " + meuRelogio.getTipoExibicao());
        meuRelogio.exibirHora();
        meuRelogio.ajustarHora(10, 30);

        // CLASSE CASA
        Casa minhaCasa = new Casa("123 Main St", 3, 150.5);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Endereço: " + minhaCasa.getEndereco());
        System.out.println("Número de Quartos: " + minhaCasa.getNumeroQuartos());
        System.out.println("Área em Metros Quadrados: " + minhaCasa.getAreaMetrosQuadrados());
        minhaCasa.abrirPorta();
        minhaCasa.fecharPorta();

        // CLASSE TELEVISAO
        Televisao minhaTV = new Televisao("LG", "Smart TV", 55);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Marca: " + minhaTV.getMarca());
        System.out.println("Modelo: " + minhaTV.getModelo());
        System.out.println("Tamanho em Polegadas: " + minhaTV.getTamanhoPolegadas());
        minhaTV.ligar();
        minhaTV.ajustarVolume(30);

        // CLASSE CALENDARIO
        Calendario hoje = new Calendario(2023, 10, 18);
        System.out.println("-------------------------------------------------------------");
        hoje.exibirData();

        // CLASSE CELULAR
        Celular meuCelular = new Celular("Apple", "Iphone 15 PRO", 2022, "Android");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Marca: " + meuCelular.getMarca());
        System.out.println("Modelo: " + meuCelular.getModelo());
        System.out.println("Ano de Fabricação: " + meuCelular.getAnoFabricacao());
        System.out.println("Sistema Operacional: " + meuCelular.getSistemaOperacional());

        meuCelular.fazerLigacao("12 99101-0101");
        meuCelular.enviarMensagem("Olá, como vai?");

        //CLASSE FILME
        Filme meuFilme = new Filme("Pulp Fiction", "Quentin Tarantino", 1994, "Drama");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Título: " + meuFilme.getTitulo());
        System.out.println("Diretor: " + meuFilme.getDiretor());
        System.out.println("Ano de Lançamento: " + meuFilme.getAnoLancamento());
        System.out.println("Gênero: " + meuFilme.getGenero());

        meuFilme.reproduzir();
        meuFilme.pausar();

        //CLASSE RESTAURANTE
        Restaurante meuRestaurante = new Restaurante("La Trattoria", "Rua das Palmeiras", 50);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Nome: " + meuRestaurante.getNome());
        System.out.println("Endereço: " + meuRestaurante.getEndereco());
        System.out.println("Capacidade: " + meuRestaurante.getCapacidade() + " pessoas");
        meuRestaurante.abrir();
        meuRestaurante.receberCliente();
        meuRestaurante.fechar();

        //CLASSE CLIENTE
        Cliente meuCliente = new Cliente("João", "Silva", 30, "Rua das Palmeiras");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Nome: " + meuCliente.getNome() + " " + meuCliente.getSobrenome());
        System.out.println("Idade: " + meuCliente.getIdade());
        System.out.println("Endereço: " + meuCliente.getEndereco());
        meuCliente.fazerPedido();
        meuCliente.pagarConta();

    }
}
