import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = leitura.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = leitura.nextDouble();

        double notaFinal = (nota1 + nota2)/2;

        if (notaFinal >= 6){
            System.out.println("Você foi APROVADO na disciplina! Sua nota foi de " + notaFinal);
        }else{
            System.out.println("Você foi REPROVADO na disciplina! Sua nota foi de " + notaFinal);
        }


    }
}
