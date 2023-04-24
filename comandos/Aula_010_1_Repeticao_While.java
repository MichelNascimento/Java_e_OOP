package comandos;
import java.util.Scanner;

public class Aula_010_1_Repeticao_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidade, cc = 0;

        System.out.println("Digite a quantidade de repetições? ");
        quantidade = teclado.nextInt();

        while(cc < quantidade){
            System.out.println("Repetição: " + (cc+1));
            cc++;
        }       
    }
    
}
