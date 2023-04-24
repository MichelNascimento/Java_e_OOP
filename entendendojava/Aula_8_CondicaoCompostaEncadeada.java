import java.util.Scanner;

public class Aula_8_CondicaoCompostaEncadeada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int DataAtual = 2023;        
        System.out.println("Digite sua data de nascimento: ");
        int DataNasc = teclado.nextInt();
        int calc = DataAtual - DataNasc;

        /******************************************************/
        /*CONDIÇÃO ENCADEADA*/
        if(calc < 16){
            System.out.println("Sua idade é: " + calc + "\nVocê não vota");
        }
        else if((calc >= 16 && calc < 18) || (calc > 70)){
        System.out.println("Sua idade é: " + calc + "\nSeu voto é OPCIONAL");
        }
        else{
            System.out.println("Sua idade é: " + calc + "\nSeu voto é ORBIGATÓRIO");
        }           
    }    
}