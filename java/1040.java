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
        float N1 = tec.nextFloat();
        float N2 = tec.nextFloat();
        float N3 = tec.nextFloat();
        float N4 = tec.nextFloat();
        float f = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;
        System.out.printf("Media: %.1f\n",f);
        if (f >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (f >= 5.0 && f <= 6.9) {
            System.out.println("Aluno em exame.");
            float e = tec.nextFloat();
            float mf = (f + e) / 2;
            System.out.printf("Nota do exame: %.1f\n", e);
            if (mf >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else if (mf < 5.0) {
                System.out.println("Aluno reprovado");
            }
            System.out.printf("Media final: %.1f\n", mf);
        } else {
            System.out.println("Aluno reprovado.");
        }


    }

}
