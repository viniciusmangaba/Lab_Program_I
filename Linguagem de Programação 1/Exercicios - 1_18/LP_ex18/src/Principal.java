import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        System.out.println("Digite o ano atual: ");
        int anoAtual = leitura.nextInt();

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = leitura.nextInt();

        int anoVotacao = anoAtual - anoNascimento;

        if (anoVotacao >=18){
            System.out.println("Sua idade é de" + anoVotacao + " anos. Você PODERÁ votar esse ano!");
        }else{
            System.out.println("Sua idade é de" + anoVotacao + " anos.Você NÃO PODERÁ votar esse ano!");
        }
    }
}
