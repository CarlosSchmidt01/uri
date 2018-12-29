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
        if (sal > 0 && sal <= 2000) {
            System.out.println("Isento");
        } else if (sal > 2000 && sal <= 3000) {
            double sf = sal - 2000;
            double imp = 0.08 * sf;
            System.out.printf("R$ %.2f\n", imp);
        } else if (sal > 3000 && sal <= 4500) {
            double sp = sal - 3000;
            double sf = sal - sp - 2000;
            double impp = sp * 0.18;
            double impp2 = sf * 0.08;
            double imp = impp + impp2;
            System.out.printf("R$ %.2f\n", imp);
        } else if (sal > 4500) {
            double sp1 = sal - 4500;
            double sp = sal - sp1 - 3000;
            double sf = sal - sp1 - sp - 2000;
            double imp3 = sp1 * 0.28;
            double imp2 = sp * 0.18;
            double imp1 = sf * 0.08;
            double imp = imp3 + imp2 + imp1;
            System.out.printf("R$ %.2f\n", imp);
        }

    }

}
