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
        double sal = tec.nextDouble();
        if (sal > 0 && sal <= 400) {
            double re = sal * 0.15;
            double ns = sal + re;
            System.out.printf("Novo salario: %.2f\n", ns);
            System.out.printf("Reajuste ganho: %.2f\n", re);
            System.out.print("Em percentual: 15 %\n");
        } else if (sal > 400 && sal <= 800) {
            double re = sal * 0.12;
            double ns = sal + re;
            System.out.printf("Novo salario: %.2f\n", ns);
            System.out.printf("Reajuste ganho: %.2f\n", re);
            System.out.print("Em percentual: 12 %\n");
        } else if (sal > 800 && sal <= 1200) {
            double re = sal * 0.10;
            double ns = sal + re;
            System.out.printf("Novo salario: %.2f\n", ns);
            System.out.printf("Reajuste ganho: %.2f\n", re);
            System.out.print("Em percentual: 10 %\n");
        } else if (sal > 1200 && sal <= 2000) {
            double re = sal * 0.07;
            double ns = sal + re;
            System.out.printf("Novo salario: %.2f\n", ns);
            System.out.printf("Reajuste ganho: %.2f\n", re);
            System.out.print("Em percentual: 7 %\n");
        } else if (sal > 2000) {
            double re = sal * 0.04;
            double ns = sal + re;
            System.out.printf("Novo salario: %.2f\n", ns);
            System.out.printf("Reajuste ganho: %.2f\n", re);
            System.out.print("Em percentual: 4 %\n");
        }
    }

}
