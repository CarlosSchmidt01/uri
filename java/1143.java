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
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>1&&n<1000){
            int a = 1;
            while(a<=n){
                int a2 = (int) Math.pow(a,2);
                int a3 = (int) Math.pow(a,3);
                System.out.println(a+" "+a2+" "+a3);
                a++;
            }
        }

    }

}
