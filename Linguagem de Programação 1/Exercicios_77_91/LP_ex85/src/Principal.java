import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir o número de dias no ano
        int numeroDiasNoAno = 365; // Assumindo um ano não bissexto

        // Criar um vetor para armazenar as temperaturas médias do ano
        double[] temperaturas = new double[numeroDiasNoAno];

        // Lê as temperaturas médias para cada dia do ano
        for (int dia = 0; dia < numeroDiasNoAno; dia++) {
            System.out.print("Digite a temperatura média para o dia " + (dia + 1) + ": ");
            temperaturas[dia] = scanner.nextDouble();
        }

        // Inicializar as variáveis para encontrar a menor e a maior temperatura
        double menorTemperatura = temperaturas[0];
        double maiorTemperatura = temperaturas[0];
        double somaTemperaturas = temperaturas[0];
        int diasAbaixoMedia = 0;

        // Calcular a menor, a maior e a soma das temperaturas
        for (int dia = 1; dia < numeroDiasNoAno; dia++) {
            double temperaturaAtual = temperaturas[dia];

            if (temperaturaAtual < menorTemperatura) {
                menorTemperatura = temperaturaAtual;
            }

            if (temperaturaAtual > maiorTemperatura) {
                maiorTemperatura = temperaturaAtual;
            }

            somaTemperaturas += temperaturaAtual;
        }

        // Calcular a temperatura média anual
        double temperaturaMediaAnual = somaTemperaturas / numeroDiasNoAno;

        // Calcular o número de dias com temperatura abaixo da média anual
        for (int dia = 0; dia < numeroDiasNoAno; dia++) {
            if (temperaturas[dia] < temperaturaMediaAnual) {
                diasAbaixoMedia++;
            }
        }

        // Exibir os resultados
        System.out.println("Menor temperatura do ano: " + menorTemperatura);
        System.out.println("Maior temperatura do ano: " + maiorTemperatura);
        System.out.println("Temperatura média anual: " + temperaturaMediaAnual);
        System.out.println("Número de dias com temperatura abaixo da média anual: " + diasAbaixoMedia);

        scanner.close();
    }
}
