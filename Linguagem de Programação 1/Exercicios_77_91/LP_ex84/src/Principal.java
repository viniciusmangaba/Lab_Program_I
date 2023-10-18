import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor N, que é o tamanho dos vetores
        System.out.print("Digite o valor de N (tamanho dos vetores): ");
        int N = scanner.nextInt();

        // Cria os vetores A, B e Soma, cada um de tamanho N
        int[] A = new int[N];
        int[] B = new int[N];
        int[] Soma = new int[N];

        // Lê os elementos do vetor A
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < N; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        // Lê os elementos do vetor B
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < N; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        // Calcula a soma dos elementos de A e B e armazena em Soma
        for (int i = 0; i < N; i++) {
            Soma[i] = A[i] + B[i];
        }

        // Imprime o vetor Soma
        System.out.println("Vetor Soma:");
        for (int i = 0; i < N; i++) {
            System.out.println("Soma[" + i + "]: " + Soma[i]);
        }

        scanner.close();
    }
}
