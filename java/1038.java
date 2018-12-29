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
        int c = tec.nextInt();
        int q = tec.nextInt();
        float t;
        switch(c){
            case 1:
                t = (float) (q*4.00);
                System.out.printf("Total: R$ %.2f\n",t);
                break;
            case 2:
                t = (float) (q*4.50);
                System.out.printf("Total: R$ %.2f\n",t);
                break;
            case 3:
                t = (float) (q*5.00);
                System.out.printf("Total: R$ %.2f\n",t);
                break;
            case 4:
                t = (float) (q*2.00);
                System.out.printf("Total: R$ %.2f\n",t);
                break;
            case 5:
                t = (float) (q*1.5);
                System.out.printf("Total: R$ %.2f\n",t);
                break;
        }

    }

}
