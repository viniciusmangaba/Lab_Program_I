public class Principal {
    public static void main(String[] args) {
        System.out.println("\nExercicio A");
        exA();

        System.out.println("\nExercicio B");
        exB();

        System.out.println("\nExercicio C");
        exC();

        System.out.println("\nExercicio D");
        exD();

        System.out.println("\nExercicio E");
        exE();

        System.out.println("\nExercicio F");
        exF();
    }
    public static void exA(){
        int a = 10;
        int b = 20;
        System.out.println("B = " + b);
        b = 5;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
    public static void exB(){
        int a = 30;
        int b = 20;
        int c = a + b;
        System.out.println("O valor de C = " + c);
        b = 10;
        System.out.println("O valor de B é = " + b + ". E o valor de C é = " + c);
        c = a + b;
        System.out.println("O valor de A é = " + a + ". O valor de B é = " + b + ". O valor de c = " + c);
    }
    public static void exC(){
        int a = 10;
        int b = 20;
        int c = a;
        b = c;
        a = b;
        System.out.println("O valor A = " + a + ". O valor B = " + b + ". O valor de C = " + c);
    }
    public static void exD(){
        int a = 10;
        int b = 10 + 1;
        a = b + 1;
        b = a + 1;
        System.out.println("O valor de A = " + a);
        a = b + 1;
        System.out.println("O valor de A = " + a + ". O valor de B = " + b);
    }
    public static void exE(){
        int a = 10;
        int b = 5;
        int c = a + b;
        b = 20;
        a = 10;
        System.out.println("O valor de a = " + a + ". O valor b = " + b + ". O valor c = " + c);
    }

    public static void exF(){
        int x = 1;
        int y = 2;
        int z = y-x;
        System.out.println("O valor de z = " + z);
        x = 5;
        y = x + z;
        System.out.println("O valor de x = " + x + ". O valor de y = " + y + ". O valor de z = " + z);
    }
}
