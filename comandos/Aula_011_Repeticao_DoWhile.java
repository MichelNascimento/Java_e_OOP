package comandos;
import java.util.Scanner;

/**************************************
 * REPETIÇÃO COM O TESTE NO FINAL
 **************************************/

public class Aula_011_Repeticao_DoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidade, cc = 0;

        System.out.println("Digite a quantidade de repetições? ");
        quantidade = teclado.nextInt();

        do{
            System.out.println("Repetição: " + (cc+1));
            cc++;
        }while(cc < quantidade);
    }    
}
