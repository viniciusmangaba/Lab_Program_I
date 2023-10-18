import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        System.out.println("Digite o número de maças que serão compradas: ");
        int numMaca = leitura.nextInt();

        if (numMaca >= 12) {
            double preco = numMaca * 1.00;
            System.out.println("O valor que deverá ser pago é de: R$" + preco);
        }else{
            double preco = numMaca * 1.20;
            System.out.println("O valor que deverá ser pago é de: R$ " + preco);
        }
    }
}
