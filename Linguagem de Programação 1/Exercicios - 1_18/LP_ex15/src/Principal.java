import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = leitura.nextInt();

        if (num >=0){
            System.out.println("O número digitado é positivo!");
        } else {
            System.out.println("O número digitado é negativo!");
        }
        leitura.close();
    }
}
