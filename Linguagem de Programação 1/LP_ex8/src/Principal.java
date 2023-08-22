import java.util.Scanner;

public class Principal {

    public static void percent (float numTotal,
                                float numBrancos,
                                float numNulos,
                                float numValidos){
        float parcialBrancos = (numBrancos/numTotal) * 100;
        System.out.println("A parcial de votos Brancos é de: " + parcialBrancos + "%");
        float parcialNulos = (numNulos/numTotal) * 100;
        System.out.println("A parcial de votos Nulos é de: " + parcialNulos + "%");
        float parcialValidos = (numValidos/numTotal) * 100;
        System.out.println("A parcial de votos Válidos é de: " + parcialValidos + "%");
    }

    public static void main(String[] args) {
        float numeroTotal;
        float numeroBrancos;
        float numeroNulos;
        float numeroValidos;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual o número total de eleitores: ");
        numeroTotal = leitura.nextFloat();

        System.out.println("Qual o número de votos brancos: ");
        numeroBrancos = leitura.nextFloat();

        System.out.println("Qual o número de votos nulos: ");
        numeroNulos = leitura.nextFloat();

        System.out.println("Qual o número de votos válidos: ");
        numeroValidos = leitura.nextFloat();

        percent (numeroTotal, numeroBrancos, numeroNulos, numeroValidos);
        leitura.close();
    }
}
