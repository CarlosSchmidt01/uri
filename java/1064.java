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
        int d = 0;
        int i = 6;
        int c = 0;
        double a = 0;
        double soma = 0;
        double media = 0;
        double b[];
        b = new double[i];
        for (int v = 0; v < 6; v++) {
            a = tec.nextDouble();
            if (a > 0) {
                b[c] = a;
                i++;
                c++;
                d++;
            }
        }
        for (int e = 0; e < b.length; e++) {
            soma += b[e];
        }
        media = soma / d;
        System.out.println(d + " valores positivos");
        System.out.printf("%.1f\n",media);

    }

}
