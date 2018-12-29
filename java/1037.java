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
        if(a>=0&&a<=25){
            System.out.println("Intervalo [0,25]");
        }else if(a>25&&a<=50){
            System.out.println("Intervalo (25,50]");
        }else if(a>50&&a<=75){
            System.out.println("Intervalo (50,75]");
        }else if(a>75&&a<=100){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }

    }

}
