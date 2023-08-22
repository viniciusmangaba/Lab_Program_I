import java.util.Scanner;

public class Principal {
    public static double custo(double cF) {
        double calculoFinal = cF + (cF * 0.28) + (cF * 0.45);
        System.out.println("O preço final do automóvel é de: " + calculoFinal);

        return calculoFinal;
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o custo de fábrica do veículo: ");
        double custoFabrica = leitura.nextDouble();

        double calculoFinal = custo(custoFabrica);
        leitura.close();
    }
}
