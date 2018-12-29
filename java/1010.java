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
         */Scanner tec = new Scanner(System.in);
        int a1 = tec.nextInt();
        int b1 = tec.nextInt();
        float c1 = tec.nextFloat();
        int a2 = tec.nextInt();
        int b2 = tec.nextInt();
        float c2 = tec.nextFloat();
        float p1[] = new float[3];
        float p2[] = new float[3];
        p1[0] = a1;
        p1[1] = b1;
        p1[2] = c1;
        p2[0] = a2;
        p2[1] = b2;
        p2[2] = c2;
        float v1 = b1*c1;
        float v2 = b2*c2;
        float vt = v1 + v2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", vt);

    }

}
