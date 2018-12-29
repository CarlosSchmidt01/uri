import java.io.IOException;
 import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner tec = new Scanner(System.in);
        int a = tec.nextInt();
        int b = tec.nextInt();
        int c = tec.nextInt();
        int M, m, i;
        if (b < a && b > c) {
            M = a;
            i = b;
            m = c;
            System.out.println(m);
            System.out.println(i);
            System.out.println(M);
        } else if (c < b && c > a) {
            M = b;
            i = c;
            m = a;
            System.out.println(m);
            System.out.println(i);
            System.out.println(M);
        } else if (a < c && a > b) {
            M = c;
            i = a;
            m = b;
            System.out.println(m);
            System.out.println(i);
            System.out.println(M);
        } else if (b > a && b < c) {
            M = c;
            i = b;
            m = a;
            System.out.println(m);
            System.out.println(i);
            System.out.println(M);
        } else if (c > b && c < a) {
            M = a;
            i = c;
            m = b;
            System.out.println(m);
            System.out.println(i);
            System.out.println(M);
        } else if (a > c && a < b) {
            M = b;
            i = a;
            m = c;
            System.out.println(m);
            System.out.println(i);
            System.out.println(M);
        }
        System.out.println("\n"+a);
        System.out.println(b);
        System.out.println(c);

    }

}
