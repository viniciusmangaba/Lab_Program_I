import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // Criando um vetor para armazenar os nomes de 10 pessoas
        String[] nomes = new String[10];

        Scanner scanner = new Scanner(System.in);

        // Fazendo a leitura dos 10 nomes
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Fazendo a leitura de um nome para busca
        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = scanner.nextLine();

        // Verificando se o nome está presente no vetor
        boolean encontrou = false;
        for (String nome : nomes) {
            if (nome.equals(nomeBusca)) {
                encontrou = true;
                break;
            }
        }

        // Exibindo a mensagem apropriada
        if (encontrou) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

        scanner.close();
    }
}
