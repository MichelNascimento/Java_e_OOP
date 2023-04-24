package comandos;
import java.util.Scanner;
/********************************************
 * Modificando o fluxo do laço com CONTINUE
 ********************************************/

public class Aula_010_2_Repeticao_WhileContinue {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidade, cc = 0;

        System.out.println("Digite a quantidade de repetições? ");
        quantidade = teclado.nextInt();

        while(cc < quantidade){
            cc++;

            if(cc == 5 || cc == 7){
                continue; 
                //Se a condição foi verdadeira ele ignora o comando abaixo e retorna para o laço.
            }
            System.out.println("Repetição: " + (cc));
        }
    }    
}
