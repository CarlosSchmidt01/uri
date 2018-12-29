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
        for (int i = 0; i < 2;) {
            int a = tec.nextInt();
            int b = tec.nextInt();
            if (a>b){
                System.out.println("Decrescente");
            }else if(a<b){
                System.out.println("Crescente");
            }else{
                System.exit(0);
            }
        }

    }

}
