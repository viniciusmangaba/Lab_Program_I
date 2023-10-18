import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 10;

        // Criar o vetor
        int[] vetor = new int[tamanhoVetor];

        // Ler os elementos para o vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        // Ler o número adicional
        System.out.print("Digite um número adicional: ");
        int numeroAdicional = scanner.nextInt();

        // Contar quantas vezes o número adicional aparece no vetor
        int contagem = 0;
        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetor[i] == numeroAdicional) {
                contagem++;
            }
        }

        // Exibir o resultado
        System.out.println("O número " + numeroAdicional + " aparece " + contagem + " vezes no vetor.");

        scanner.close();
    }
}
