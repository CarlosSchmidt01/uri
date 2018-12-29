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
        int h1 = tec.nextInt();
        int h2 = tec.nextInt();
        if (h2 <= h1) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 - (h1 - h2));
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", h2 - h1);
        }

    }

}
