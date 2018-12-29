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
        int[] b = new int[100];
        int maior = 0;
        int pos = 0;
        for (int i = 1; i <= 100; i++) {
            int a = tec.nextInt();
            if (a > maior) {
                maior = a;
                pos = i;
            }
        }
        System.out.println(maior);
        System.out.println(pos);

    }

}
