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
        int i = 0;
        int o = 0;
        if (n < 10000) {
            for (int a = 0; a < n; a++) {
                int x = tec.nextInt();
                if (x > -10000 && x < 10000) {
                    if (x >= 10 && x <= 20) {
                        i++;
                    } else {
                        o++;
                    }
                }
            }
        }
        System.out.println(i + " in");
        System.out.println(o + " out");

    }

}
