import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a base do retangulo (m): ");
        float base = Float.parseFloat(leitura.nextLine());

        System.out.println("Digite a altura do triangulo (m): ");
        float altura = Float.parseFloat(leitura.nextLine());

        double area = base * altura;
        System.out.println("A área do retângulo é de: " + area + "m²");

    }
}
