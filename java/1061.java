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
        String string;
        int dia_i, dia_f, hora_i, hora_f, min_i, min_f, seg_i, seg_f;
        int dia = 0, hora = 0, min = 0, seg = 0;
        boolean bool_h = false, bool_m = false, bool_s = false;
        string = tec.next();
        dia_i = tec.nextInt();
        hora_i = tec.nextInt();
        string = tec.next();
        min_i = tec.nextInt();
        string = tec.next();
        seg_i = tec.nextInt();
        //----------
        string = tec.next();
        dia_f = tec.nextInt();
        hora_f = tec.nextInt();
        string = tec.next();
        min_f = tec.nextInt();
        string = tec.next();
        seg_f = tec.nextInt();
        if (hora_i > hora_f) {
            bool_h = true;
        }
        if (min_i > min_f) {
            bool_m = true;
        }
        if (seg_i > seg_f) {
            bool_s = true;
        }
        while (dia_i != dia_f) {
            dia++;
            dia_i++;
        }
        while (hora_i != hora_f) {
            hora++;
            hora_i++;
            if (hora_i == 25) {
                hora_i = 1;
            }
        }
        while (min_i != min_f) {
            min++;
            min_i++;
            if (min_i == 61) {
                min_i = 1;
            }
        }
        while (seg_i != seg_f) {
            seg++;
            seg_i++;
            if (seg_i == 61) {
                seg_i = 1;
            }
        }
        if(bool_h==true){
            dia--;
        }
        if(bool_m==true){
            hora--;
        }
        if(bool_s==true){
            min--;
        }
        System.out.println(dia+" dia(s)");
        System.out.println(hora+" hora(s)");
        System.out.println(min+" minuto(s)");
        System.out.println(seg+" segundo(s)");

    }

}
