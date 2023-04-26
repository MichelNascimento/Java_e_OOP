package comandos;
import java.util.Scanner;

public class Aula_012_Repeticao_For {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidade, cc = 0;

        System.out.println("Digite a quantidade de re[etoções? ");
        quantidade = teclado.nextInt();

        for(cc = 0 ; cc < quantidade ; cc++){
            System.out.println("Repeticão: " + (cc+1));
        }
    }
}