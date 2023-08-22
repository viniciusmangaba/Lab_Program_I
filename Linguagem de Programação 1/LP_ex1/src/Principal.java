/*Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em
uma variável B. A seguir (utilizando apenas atribuições entre variáveis) troque
os seus conteúdos fazendo com que o valor que está em A passe para B e vice-versa.
Ao final, escrever os valores que ficaram armazenados nas variáveis.*/

public class Principal {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("O valor antigo de A: " + a);
        System.out.println("O valor antigo de B: " + b);

        int novo_a = b;
        int novo_b = a;

        System.out.println("O novo valor de A: " + b);
        System.out.println("O novo valor de B: " + a);

    }

}
