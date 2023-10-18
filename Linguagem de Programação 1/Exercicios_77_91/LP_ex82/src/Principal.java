import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um vetor A de 10 números
        int[] A = new int[10];

        // Lendo os 10 números para o vetor A
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        // Lendo o número X
        System.out.print("Digite o valor de X: ");
        int X = scanner.nextInt();

        // Criando um vetor M para armazenar os resultados da multiplicação
        int[] M = new int[10];

        // Calculando e armazenando a multiplicação em M
        for (int i = 0; i < 10; i++) {
            M[i] = A[i] * X;
        }

        // Imprimindo o vetor M
        System.out.print("Vetor M: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(M[i] + " ");
        }

        scanner.close();
    }
}
