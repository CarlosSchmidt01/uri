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
        int d =tec.nextInt();
        if(d==61){
            System.out.println("Brasilia");
        }else if(d==71){
            System.out.println("Salvador");
        }else if(d==11){
            System.out.println("Sao Paulo");
        }else if(d==21){
            System.out.println("Rio de Janeiro");
        }else if(d==32){
            System.out.println("Juiz de Fora");
        }else if(d==19){
            System.out.println("Campinas");
        }else if(d==27){
            System.out.println("Vitoria");
        }else if(d==31){
            System.out.println("Belo Horizonte");
        }else{
            System.out.println("DDD nao cadastrado");
        }
    }

}
