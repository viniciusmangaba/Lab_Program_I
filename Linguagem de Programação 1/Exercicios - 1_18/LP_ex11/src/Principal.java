import java.util.Scanner;

public class Principal {
    public static double calculoComissao (int nC, double vC){
        return (nC * vC);
    }
    public static double calcComissaoPerc (double vT){
        return (0.05*vT);
    }
    public static double calculoFinal (double sF, double vC, double vCP){
        return (sF + vC + vCP);
    }
    public static void exibirSalario (double sF){
        System.out.println("O salario final do vendedor é de: " + sF);
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Quantos carros foram vendidos: ");
        int numCarros = leitura.nextInt();

        System.out.println("Qual foi o valor total das vendas: " );
        double valorTotal = leitura.nextDouble();

        System.out.println("Qual é o seu salário fixo: ");
        double salarioFixo = leitura.nextDouble();

        System.out.println("Qual valor por carro vendido: ");
        double carroVendido = leitura.nextDouble();

        double valorComissao = calculoComissao (numCarros, carroVendido);
        System.out.println("Sua comissão foi de: " + valorComissao);

        double valorComissaoPercentual = calcComissaoPerc (valorTotal);
        System.out.println("Sua comissão percentual foi de: " + valorComissaoPercentual);

        double salarioFinal = calculoFinal (salarioFixo, valorComissao, valorComissaoPercentual);

        exibirSalario(salarioFinal);
        leitura.close();

    }
}
