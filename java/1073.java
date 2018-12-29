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
        if (n > 5 && n < 2000) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    int p = (int) Math.pow(i, 2);
                    System.out.println(i + "^2 = " + p);
                }
            }
        }

    }

}
