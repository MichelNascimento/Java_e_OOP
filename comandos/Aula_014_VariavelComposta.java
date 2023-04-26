package comandos;
import java.util.Arrays;

public class Aula_014_VariavelComposta {
    public static void main(String[] args) {
        
        /* *****************************************************************
        * 
        * int n[] = new int[4];
        * QUANDO USAMOS A PALAVRA "new", ESTAMOS CRIANDO UM NOVO OBJETO,
        * UMA COLEÇÀO (VETOR) EM JAVA E ELE POSSUI MÉTODOS E ATRIBUTOS
        * 
        * ****************************************************************/

        int n[] = new int[4];

        int c;
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(c = 0 ; c < mes.length ; c++){
            System.out.println("O mês de " + mes[c] + " tem " + dias[c] + " dias ao todo");
        }

        /********************************************************************************
         * MANEIRAS DE EXIBIR OS VALORES DO VETOR
         *******************************************************************************/
        
         // UTILIZANDO O FOR //
         int num [] = {3, 5, 1, 8, 4};
         int i;

         for(i=0 ; i<5 ; i++){
            System.out.println("Indice " + i + "=" + num[i]);
         }

         //UTILIZANDO 'FOR EACH', ELE FUNCIONA EXCLUSIVAMENTE PARA COLEÇÕES(VETORES) //

         int num2 [] = {3, 5, 1, 8, 4};

         for(int valor: num){
            System.out.println(valor);
         }

         /* ***********************************************************************
          * ORDENANDO VETOR
          * ***********************************************************************/   
         //classe para ordenar o vetor "arrays.sort()"

         int num3[] = {3, 5, 1, 8, 4};

         Arrays.sort(num3);
         for(int valor: num3){
            System.out.println(valor);
         }       
         
         /* ***********************************************************************
          * FAZER BUSCA NO VETOR
          * ***********************************************************************/
          int vet [] = {3, 7, 6, 1, 9, 4, 2};
          Arrays.sort(vet);

          for(int v: vet){
            System.out.print(v + " ");
          }
          System.out.println("");
          int pos = Arrays.binarySearch(vet, 9);
          System.out.println(pos);

          /*****************************************************
           * PREENCHIMENTO AUTOMATICO DO VETOR
           *****************************************************/

           int vet2[] = new int[5];
           Arrays.fill(vet2, 5);
           for(int valor: vet2){
            System.out.println(valor);
           }
        
    }    
}