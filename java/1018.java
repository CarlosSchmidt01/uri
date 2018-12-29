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
        int n = tec.nextInt();
        int c100 = 0;
        int c50 = 0;
        int c20 = 0;
        int c10 = 0;
        int c5 = 0;
        int c2 = 0;
        int c1 = 0;

        System.out.println(n);
        if (n > 0 && n < 1000000) {
            while (n >= 100) {
                c100++;
                n = n - 100;
            }
            if (n >= 50) {
                c50++;
                n = n - 50;
            }
            if (n >= 20) {
                c20++;
                n = n - 20;
            }
            if (n >= 10) {
                c10++;
                n = n - 10;
            }
            if (n >= 5) {
                c5++;
                n = n - 5;
            }
            if (n >= 2) {
                c2++;
                n = n - 2;
            }
            if (n >= 1) {
                c1++;

            }
        }
        System.out.print(c100 + " nota(s) de R$ 100,00\n");
        System.out.print(c50 + " nota(s) de R$ 50,00\n");
        System.out.print(c20 + " nota(s) de R$ 20,00\n");
        System.out.print(c10 + " nota(s) de R$ 10,00\n");
        System.out.print(c5 + " nota(s) de R$ 5,00\n");
        System.out.print(c2 + " nota(s) de R$ 2,00\n");
        System.out.print(c1 + " nota(s) de R$ 1,00\n");

    }

}
