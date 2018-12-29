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
        double r = tec.nextDouble();
        double R = Math.pow(r, 3);
        double pi = 3.14159;
        double v = (4.0 / 3) * pi * R;
        System.out.printf("VOLUME = %.3f\n", v);

    }

}
