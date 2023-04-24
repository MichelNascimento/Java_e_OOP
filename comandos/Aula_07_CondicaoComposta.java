package comandos;
import java.util.Scanner;

public class Aula_07_CondicaoComposta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int DataAtual = 2023;        
        System.out.println("Digite sua data de nascimento: ");
        int DataNasc = teclado.nextInt();
        int calc = DataAtual - DataNasc;
        System.out.println("Sua idade é: " + calc);

        /******************************************************/
        /*CONDIÇÃO COMPOSTA*/
        if(calc >= 18){
            System.out.println("Você é de MAIOR");
        }
        else{
            System.out.println("Você é de MENOR");
        }
    }  
    
}
