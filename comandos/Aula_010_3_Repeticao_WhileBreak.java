package comandos;
import java.util.Scanner;
/**************************************
 * Mudando o fluxo do la;co com o BREAK 
 **************************************/
public class Aula_010_3_Repeticao_WhileBreak {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidade, cc = 0;

        System.out.println("Digite a quantidade de repetições?");
        quantidade = teclado.nextInt();

        while(cc < quantidade){
            cc++;
            if(cc == 5 || cc == 7){
                continue;
            }
            if(cc == 8){
                break;
                /*se a condicão for verdadeira, o laço é interronpido*/
            }
            System.out.println("repetições: " + (cc));
        }
    }    
}
