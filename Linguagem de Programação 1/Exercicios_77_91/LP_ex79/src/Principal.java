import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Criando um vetor para armazenar as notas dos 20 alunos
        double[] notas = new double[20];
        Scanner scanner = new Scanner(System.in);

        // Fazendo a leitura das notas dos alunos
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calculando a média da turma
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / 20;

        // Contando quantos alunos obtiveram notas acima da média
        int acimaDaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaDaMedia++;
            }
        }

        // Exibindo a média da turma e o resultado da contagem
        System.out.println("Média da turma: " + media);
        System.out.println("Alunos com nota acima da média: " + acimaDaMedia);

        scanner.close();
    }
}
