import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Quantos anos você tem: ");
        int anos = leitura.nextInt();

        System.out.println("Quantos meses você tem: ");
        int meses = leitura.nextInt();

        System.out.println("Quantos dias você tem: ");
        int dias = leitura.nextInt();

        int total = (anos*365)+(meses*12)+dias;
        System.out.println("Você tem um total de " + total + " dias de vida!");
    }
}
