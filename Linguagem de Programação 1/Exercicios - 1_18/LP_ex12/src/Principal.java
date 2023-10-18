import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus Fahrenheit: ");
        double grausFahrenheit = leitura.nextDouble();
        leitura.close();

        double grausCelsius = (grausFahrenheit - 32) * 5/9;
        System.out.println("A temperatura em Fahrenheit é de " + grausFahrenheit + "F. E a em Celsius é de: " + grausCelsius + "ºC");

    }
}
