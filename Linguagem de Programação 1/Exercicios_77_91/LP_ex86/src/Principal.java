import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar um vetor para armazenar os 10 números
        int[] vetor = new int[10];

        // Lê os 10 números e os armazena no vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }

        // Chama a função de ordenação (Bubble Sort)
        bubbleSort(vetor);

        // Exibe o vetor ordenado
        System.out.println("Vetor Ordenado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }

    // Função de ordenação Bubble Sort
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocado;
        do {
            trocado = false;
            for (int i = 1; i < n; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    int temp = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = temp;
                    trocado = true;
                }
            }
        } while (trocado);
    }
}
