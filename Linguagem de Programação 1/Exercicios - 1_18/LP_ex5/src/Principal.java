import java.util.Scanner;

public class Principal {
    public static int antecessor (int num){
        return (num - 1);
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        System.out.println("O antecessor do " + numero + " é: " + antecessor(numero));
        leitura.close();

    }
}
