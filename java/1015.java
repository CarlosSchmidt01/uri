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
        float x1 = tec.nextFloat();
        float y1 = tec.nextFloat();
        float x2 = tec.nextFloat();
        float y2 = tec.nextFloat();
        float p1[] = new float[2];
        float p2[] = new float[2];
        p1[0] = x1;
        p1[1] = y1;
        p2[0] = x2;
        p2[1] = y2;
        double x = Math.pow(x2-x1,2);
        double y = Math.pow(y2-y1,2);
        double d = Math.sqrt(x+y);
        System.out.printf("%.4f\n",d);

    }

}
