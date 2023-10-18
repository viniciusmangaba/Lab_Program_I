import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = leitura.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = leitura.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = leitura.nextDouble();

        double mediaponderada = (nota1*2 + nota2*3 + nota3*5)/10;

        System.out.println("A média ponderada é de: " + mediaponderada);

    }

}
