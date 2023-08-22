import java.util.Scanner;

public class Principal {
    public static void novoSalario (float sA, float rS){
        float total = sA + (sA*(rS/100));

        System.out.println("Seu novo salário será de: R$" + total);
    }
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o seu atual salário mensal: ");
        float salarioAtual = leitura.nextFloat();

        System.out.println("Digite o percentual de reajuste salarial: ");
        float reajusteSalario = leitura.nextFloat();

        novoSalario (salarioAtual, reajusteSalario);
        leitura.close();


    }
}
