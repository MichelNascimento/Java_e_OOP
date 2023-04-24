package comandos;
import java.util.Scanner;

public class Aula_006_CondicaoSimples {    
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Digit s notas: ");

        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float media = (n1 + n2) /2;

        System.out.println("Sua média foi " + media);

        /*************************************************/
        /*CONDIÇÃO SIMPLES */
        if(media > 9){
            System.out.println("Parabéns");
        }  
    }   
    
}
