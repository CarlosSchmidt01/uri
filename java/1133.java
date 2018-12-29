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
        int x = tec.nextInt();
        int y = tec.nextInt();
        int mult;
        if (x < y) {
            while (x < y-1) {
                x++;
                int rest = x % 5;
                if (rest == 2 || rest == 3) {
                    mult = x;
                    System.out.println(mult);
                }
            }
        } else if (x > y) {
            while (x-1 > y) {
                y++;
                int rest = y % 5;
                if (rest == 2 || rest == 3) {
                    mult = y;
                    System.out.println(mult);
                }
            }
        }

    }

}
