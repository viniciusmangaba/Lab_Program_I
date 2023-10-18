import java.util.Scanner;
import java.util.InputMismatchException;

public class ExemploTratamentoExcecaoEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean numeroValido = false;

        while (!numeroValido) {
            try {
                System.out.print("Digite um número inteiro: ");
                int numero = scanner.nextInt();
                System.out.println("Você digitou: " + numero);
                numeroValido = true; // O número é válido, então saímos do loop.
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Certifique-se de que você digitou um número inteiro.");
                scanner.next(); // Limpa a entrada inválida do Scanner.
            }
        }

        System.out.println("Fim do programa.");
        scanner.close();
    }
}
