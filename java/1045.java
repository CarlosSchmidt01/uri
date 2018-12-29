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
         double A, B, C;
  Scanner input =new Scanner(System.in);
  A = input.nextDouble();
  B = input.nextDouble();
  C = input.nextDouble();
  double tempA = Math.max(A, Math.max(B, C));
  double tempB = 0;
  double tempC = 0;

  if (tempA == A) {
   tempB =Math.max(B, C);
   tempC =Math.min(B, C);
  }
  if (tempA == B) {
   tempB =Math.max(A, C);
   tempC =Math.min(A, C);
  }
  if (tempA == C) {
   tempB =Math.max(B, A);
   tempC =Math.min(B, A);
  }
  //------------------------------
  if (tempA >= (tempB + tempC)) {
   System.out.print("NAO FORMA TRIANGULO\n");

  }else if (tempA*tempA > ((tempB*tempB)+(tempC*tempC))) {
   System.out.print("TRIANGULO OBTUSANGULO\n");
  }
  if (tempA*tempA == ((tempB*tempB)+(tempC*tempC))) {
   System.out.print("TRIANGULO RETANGULO\n");
  }

   if (tempA*tempA < ((tempB*tempB)+(tempC*tempC))) {
   System.out.print("TRIANGULO ACUTANGULO\n");
  }
  if ((tempA == tempB) &&(tempA == tempC)) {
   System.out.print("TRIANGULO EQUILATERO\n");
  }
  if (((tempA == tempB) &&(tempA != tempC)) || ((tempA == tempC) &&(tempA != tempB)) || ((tempB == tempC) &&(tempB != tempA)) ) {
   System.out.print("TRIANGULO ISOSCELES\n");
  }

    }

}
