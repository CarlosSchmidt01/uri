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
        float a = tec.nextFloat();
        float b = tec.nextFloat();
        float c = tec.nextFloat();
        if ((Math.abs(b - c)) < a && a < (b + c) || (Math.abs(a - c) < b && b < (a + c)) || (Math.abs(a - b) < c && c < (a + b))) {
            float p = a + b + c;
            System.out.printf("Perimetro = %.1f\n", p);
        } else {
            float ar = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", ar);
        }

    }

}
