import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoVetor = 10;

        // Criar o vetor
        int[] VET = new int[tamanhoVetor];

        // Ler os 50 números e armazenar no vetor
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            VET[i] = scanner.nextInt();
        }

        boolean[] numerosRepetidos = new boolean[tamanhoVetor];

        // Verificar números repetidos e registrar suas posições
        for (int i = 0; i < tamanhoVetor; i++) {
            for (int j = i + 1; j < tamanhoVetor; j++) {
                if (VET[i] == VET[j]) {
                    numerosRepetidos[i] = true;
                    numerosRepetidos[j] = true;
                }
            }
        }

        // Exibir números repetidos e suas posições
        System.out.println("Números repetidos no vetor e suas posições:");

        for (int i = 0; i < tamanhoVetor; i++) {
            if (numerosRepetidos[i]) {
                System.out.println("Número: " + VET[i] + ", Posição: " + i);
            }
        }

        scanner.close();
    }
}
