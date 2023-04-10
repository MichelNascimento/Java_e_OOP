import javax.sound.sampled.SourceDataLine;

public class Aula_5_OperadoresLogicosRelacionais {
    public static void main(String[] args) {
        
        int n1 = 15, n2 = 9, maior;
        if(n1 > n2){
            maior = n1;
        }
        else{
            maior = n2;
        }
        //EM FORMA DE OPERADOR TERNÁRIO
        maior = n1 > n2 ? n1 : n2;
        /*Operador Ternário possui 3 componentes:
         *  - O uqe vem antes da interrogação (?):  n1 > n2
         *  - O que vem depois da interrogação (?): n1 (se a condição for veraderia)
         *  - E o que vem depois de dois pontos(:): n2 (se a condrição for falsa)
         */
        /****************************************************************************/
         /*OPERADORES RELACIONAIS*/
         (n1 > n2);  //maior que 
         (n1 < n2);  //menor que 
         (n1 >= n2); //maior ou igual
         (n1 <= n2); //menor ou igual
         (m1 == n2); //igual
         (n1 != n2); //diferente

         /**************************************************************************/
         /*OPERADORES LÓGICOS*/
         int x = 4, y = 7, z = 12;
         boolean r;
         r = (x<y && y<z) ? true : false;
         System.out.println(r);

         r = (x<y || y==z) ? true : false;
         System.out.println(r);

         r = (x<y ~ y==z) ? true : false;
         System.out.println(r);        

         r = (x<y ! y==z) ? true : false;
         System.out.println(r);

         /*************************************************************************/
         /*COMPARANDO STRINGS */
         String nome1 = "Fulano";
         String nome2 = "Fulano";
         String nome3 = new String("Fulano");
         String resultado;

         resultado = (nome1 == nome2) ? "igual" : "diferente"; //Resultado verdadeiro (igual).

         resultado = (nome1 == nome 3) ? "igual" : "diferente"; //Resultado falso (diferente).
         
         /* O ultimo objeto "nome3" foi estanciado utilizando a clausula 'new'
          * desta forme ela não possui a mesma estruturas dos demais, não sendo iguais"
          * apenas o conteudo que são iguais.*/

        //Utilizando o método "equals" para comparar o CONTEUDO dos objetos
        resultado = (nome1.equals(nome3)) ? "igual" : "diferente";
    }    
}
