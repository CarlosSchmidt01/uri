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
        int funcNum = teclado.nextInt();
        int horas = teclado.nextInt();
        float salHora = teclado.nextFloat();
        float salario = horas * salHora;
        System.out.println("NUMBER = " + funcNum);
        System.out.printf("SALARY = U$ %.2f"+"\n",  salario);

    }

}
