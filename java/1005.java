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
       Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        float p1 = 3.5f;
        float p2 = 7.5f;
        double soma = p1 + p2;
        if(a>=0 && a<=10){
            if(b>=0 && a<=10){
                double media = (a*p1 + b*p2)/soma;
                System.out.printf("MEDIA = %.5f", media);
            }
        }
        System.out.println("");
    }

}
