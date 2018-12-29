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
        int p = 0;
        int i = 0;
        int po = 0;
        int n = 0;
        for (int x = 0; x < 5; x++) {
            int y = tec.nextInt();
            if (y > 0) {
                po++;
            } else if (y < 0) {
                n++;
            }
            if (y % 2 == 0) {
                p++;
            } else {
                i++;
            }

        }
        System.out.println(p + " valor(es) par(es)");
        System.out.println(i + " valor(es) impar(es)");
        System.out.println(po + " valor(es) positivo(s)");
        System.out.println(n + " valor(es) negativo(s)");

    }

}
