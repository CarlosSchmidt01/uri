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
        int b = 0;
        int v = 0;
        while (v < 6) {
            double a = tec.nextDouble();
            if (a > 0) {
                b++;
            }
            v++;
        }
        System.out.println(b + " valores positivos");

    }

}
