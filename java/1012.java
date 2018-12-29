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
        double a = tec.nextDouble();
        double b = tec.nextDouble();
        double c = tec.nextDouble();
        double t = (a*c)/2;
        double ci = 3.14159*c*c;
        double tr = ((a+b)*c)/2;
        double q = b*b;
        double r = a*b;
        System.out.printf("TRIANGULO: %.3f\n", t);
        System.out.printf("CIRCULO: %.3f\n",ci);
        System.out.printf("TRAPEZIO: %.3f\n",tr);
        System.out.printf("QUADRADO: %.3f\n",q);
        System.out.printf("RETANGULO: %.3f\n",r);

    }

}
