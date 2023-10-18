import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 15;

        // Criar os vetores V1 e V2
        int[] V1 = new int[tamanhoVetor];
        int[] V2 = new int[tamanhoVetor];

        // Ler os elementos para o vetor V1
        System.out.println("Digite os elementos do vetor V1:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("V1[" + i + "]: ");
            V1[i] = scanner.nextInt();
        }

        // Ler os elementos para o vetor V2
        System.out.println("Digite os elementos do vetor V2:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("V2[" + i + "]: ");
            V2[i] = scanner.nextInt();
        }

        // Contar a quantidade de vezes que V1 e V2 possuem os mesmos números nas mesmas posições
        int quantidadeIguais = 0;
        for (int i = 0; i < tamanhoVetor; i++) {
            if (V1[i] == V2[i]) {
                quantidadeIguais++;
            }
        }

        // Exibir o resultado
        System.out.println("Quantidade de números iguais nas mesmas posições: " + quantidadeIguais);

        scanner.close();
    }
}
