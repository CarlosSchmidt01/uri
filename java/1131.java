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
        int opt = 1;
        int gren = 0;
        int vint = 0;
        int vgre = 0;
        int emp = 0;
        String venc = "";
        while (opt == 1) {
            gren++;
            int x = tec.nextInt();
            int y = tec.nextInt();
            if(x>y){
                vint +=1;
            }else if(x<y){
                vgre +=1;
            }else{
                emp+=1;
            }
            if (vint>vgre){
                venc = "Inter venceu mais";
            }else if (vint<vgre){
                venc = "Gremio venceu mais";
            }else{
                venc = "Nao houve vencedor";
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            opt = tec.nextInt();
        }
        System.out.println(gren+" grenais");
        System.out.println("Inter:"+vint);
        System.out.println("Gremio:"+vgre);
        System.out.println("Empates:"+emp);
        System.out.println(venc);

    }

}
