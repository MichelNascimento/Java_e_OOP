package comandos;
import java.util.Scanner;

public class Aula_009_CondicaoMultiplas {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quantas pernas? ");

    int pernas = teclado.nextInt();
    String tipo;
    switch(pernas)
    {
        case 1:
            tipo = "Saci";
            break;
        case 2:
            tipo = "Bícepe";
            break;
        case 3:
            tipo = "Tripé";
            break;
        case 4:
            tipo = "Quadrúpede";
            break;
        case 6:
            tipo = "Aranha";
            break;
        default:
            tipo = "ET";
    }
    System.out.println("O tipo é: "+ tipo);
    }
    
}
