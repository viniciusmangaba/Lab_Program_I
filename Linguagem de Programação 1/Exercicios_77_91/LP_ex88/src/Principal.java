import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar um vetor para armazenar os 20 números
        int[] vetor = new int[20];

        // Lê os 20 números e os armazena no vetor
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }

        // Lê o número adicional
        System.out.print("Digite um número adicional: ");
        int numeroAdicional = scanner.nextInt();

        // Verifica se o número existe no vetor
        boolean numeroEncontrado = false;
        for (int i = 0; i < 20; i++) {
            if (vetor[i] == numeroAdicional) {
                numeroEncontrado = true;
                break;
            }
        }

        // Se o número existir, gera um novo vetor sem o número
        if (numeroEncontrado) {
            int[] novoVetor = new int[19];
            int j = 0;
            for (int i = 0; i < 20; i++) {
                if (vetor[i] != numeroAdicional) {
                    novoVetor[j] = vetor[i];
                    j++;
                }
            }

            System.out.println("O número foi encontrado no vetor e removido.");
            System.out.print("Novo vetor sem o número:");
            for (int i = 0; i < 19; i++) {
                System.out.print(" " + novoVetor[i]);
            }
        } else {
            System.out.println("O número não foi encontrado no vetor.");
        }

        scanner.close();
    }
}
