import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um vetor para armazenar os 20 números
        int[] numeros = new int[20];

        // Lendo os 20 números e armazenando no vetor
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Escrevendo os números na ordem inversa
        System.out.println("Números na ordem inversa:");

        for (int i = 19; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
