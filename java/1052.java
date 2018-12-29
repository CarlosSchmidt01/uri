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
        int a = tec.nextInt();
        if(a==1){
            System.out.println("January");
        }else if(a==2){
            System.out.println("February");
        }else if(a==3){
            System.out.println("March");
        }else if(a==4){
            System.out.println("April");
        }else if(a==5){
            System.out.println("May");
        }else if(a==6){
            System.out.println("June");
        }else if(a==7){
            System.out.println("July");
        }else if(a==8){
            System.out.println("August");
        }else if(a==9){
            System.out.println("September");
        }else if(a==10){
            System.out.println("October");
        }else if(a==11){
            System.out.println("November");
        }else if(a==12){
            System.out.println("December");
        }

    }

}
