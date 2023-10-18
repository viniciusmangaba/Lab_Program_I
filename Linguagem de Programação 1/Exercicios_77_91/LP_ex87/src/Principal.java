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

        // Lê um número adicional
        System.out.print("\nDigite um número adicional: ");
        int novoNumero = scanner.nextInt();

        // Insere o novo número na posição correta e mantém a ordem crescente
        vetor = inserirElementoOrdenado(vetor, novoNumero);

        // Exibe o vetor atualizado
        System.out.println("Vetor com o novo número inserido:");
        for (int i = 0; i < 11; i++) {
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

    // Função para inserir um elemento em ordem crescente
    public static int[] inserirElementoOrdenado(int[] vetor, int novoNumero) {
        int n = vetor.length;
        int[] novoVetor = new int[n + 1];

        int i = 0;
        while (i < n && novoNumero > vetor[i]) {
            novoVetor[i] = vetor[i];
            i++;
        }

        novoVetor[i] = novoNumero;

        while (i < n) {
            novoVetor[i + 1] = vetor[i];
            i++;
        }

        return novoVetor;
    }
}
