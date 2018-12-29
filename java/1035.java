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
        int A = tec.nextInt();
        int B = tec.nextInt();
        int C = tec.nextInt();
        int D = tec.nextInt();
        if(B>C&&D>A&&(C+D)>(A+B)&&(C>0&&D>0)&&(A%2==0)){
                        System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }

    }

}
