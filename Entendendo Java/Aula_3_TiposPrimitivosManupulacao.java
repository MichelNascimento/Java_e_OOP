import java.util.Scanner;

public class Aula_3_TiposPrimitivosManupulacao {
    public static void main(String[] args) {
        /***********************************/
        /*Formas de delcarar Váriaveis*/
        /***********************************
        *
        *1º FORMA: MAIS COMUM.*/
        int idade = 3;
        float salario = 1825.54f;
        char letra = 'G';
        boolean casado = false;

        /*2º FORMA: TYPECATS (Especificando tipo de valores).*/
        int idade = (int) 3;
        float salario = (float) 1825.54;
        char letra = (char) 'G';
        boolean casado = (boolean) false;   

        /*3º FORMA: WRAPPER (Utilizando classes)*/
        Integer idade = new Integer(3);
        Float salario = new Float(1825.54);
        Character letra = new letra('G');
        Boolean casado = new boolean(false);

        /**************************************/
        /*TIPOS DE SAÍDA DE DADOS*/
        /**************************************
        *
        *SAÍDA DE FORMA SIMPLES*/
        System.out.print("Sua note é" + nota);
        System.out.println("Sua nota é" + nota);

        /*SAÍDA DE FORMA FORMATADA*/
        System.out.printf("Sua nota é %.2f", nota);
        System.out.format("Sua nota é %.2f", nota);

        /*TIPOS DE ENTRADA DE DADOS
        *Métodos para ler valores de tipos diferentes*/
        int idade = teclado.nextInt();
        float salrio = teclado.nextFloat();
        Strig nome = teclado.nextLina();
        /*********************************************/

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno ");
        String nome = teclado.nextLine();

        System.out.println("Digite sua nota ");
        float nota = teclado.nextFloat();

        System.out.println("A nota do aluno %s é %.2f", nome, nota);

        /*****************************************
        * INCOMPATIBILIDADES (NÚMEROS <-->STRING)
        /*****************************************/

        int idade = 30;
        Sting valor = idade; //INCOMPATÍVEL
        String valor = Integer.toString(idade); //COMPATÍVEL

        String valor = "30";
        int idade = valor; //INCOMPATÍVEL
        int idade = Integer.parseInt(valor); //COMPATÍVEL
    }    
}
