import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        int numero = leitura.nextInt();

        if (numero > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}
