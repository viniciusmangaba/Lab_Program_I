public class Principal {
    public static void main(String[] args) {
        System.out.println("\nExercicio A");
        exA();

        System.out.println("\nExercicio B");
        exB();

        System.out.println("\nExercicio C");
        exC();
    }

    public static void exA(){
        int a = (4/2)+(2/4);
        System.out.println("A = " + a);
        a = 4/2 + 2/4;
        System.out.println("A = " + a);
    }

    public static void exB(){
        int b = 4/(2+2)/4;
        System.out.println("B = " + b);
        b = 4/2 + 2/4;
        System.out.println("B = " + b);
    }

    public static void exC(){
        int c = (4+2) * 2-4;
        System.out.println("C = " + c);
        c = 4+2 * 2-4;
        System.out.println("C = " + c);
    }
}
