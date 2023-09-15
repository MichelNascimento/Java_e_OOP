package Aula04_03.view;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("** ESTACIONAMENTO **");

        System.out.println("Informe o veiculo desejado: (C)arro ou (M)oto: ");

        // objeto "anônimo"
        //String input = new Scanner(System.in).next();

        Scanner input = new Scanner(System.in);
        String tipoVeiculo = input.next();

        System.out.println("Informe o nome do modelo: ");
        String nome = input.next();
        System.out.println("Informe o fabricante: ");
        String fabricante = input.next();
        System.out.println("Informe o ano do vaiculo: ");
        int ano = input.nextInt();

        if(tipoVeiculo.equals("C")){
            System.out.println("Infore a quantidade de portas: ");
            int quantidadePortas = input.nextInt();
            veiculo = new Carro(nome,fabricante, anoFabricacao, )

        }
        
    }
    
}
