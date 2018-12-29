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
        float x = tec.nextFloat();
        float y = tec.nextFloat();
        if(x==y&&y==0){
            System.out.println("Origem");
        }else if(x==0){
            System.out.println("Eixo Y");
        }else if(y==0){
            System.out.println("Eixo X");
        }else if(x>0&&y>0){
            System.out.println("Q1");
        }else if(x<0&&y>0){
            System.out.println("Q2");
        }else if(x<0&&y<0){
            System.out.println("Q3");
        }else if(x>0&&y<0){
            System.out.println("Q4");
        }

    }

}
