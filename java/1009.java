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
        String nome = teclado.nextLine();
        double salario = teclado.nextDouble();
        double totVendas = teclado.nextDouble();
        double comicao = totVendas * 15 / 100;
        double total = salario + comicao;
        System.out.printf("TOTAL = R$ %.2f"+"\n", total);
    }

}
