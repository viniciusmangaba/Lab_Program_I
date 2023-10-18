import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um vetor Q de 20 posições
        int[] Q = new int[20];

        // Lendo os números positivos e preenchendo o vetor Q
        for (int i = 0; i < 20; i++) {
            int numero;
            do {
                System.out.print("Digite um número positivo para a posição " + i + ": ");
                numero = scanner.nextInt();
            } while (numero < 0);
            Q[i] = numero;
        }

        // Encontrando o menor elemento e a posição
        int menorElemento = Q[0];

        for (int i = 1; i < 20; i++) {
            if (Q[i] < menorElemento) {
                menorElemento = Q[i];
            }
        }

        // Exibindo o valor do menor elemento
        System.out.println("O menor elemento de Q é " + menorElemento);

        scanner.close();
    }
}
