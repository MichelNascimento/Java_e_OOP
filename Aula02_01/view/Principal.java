package Aula02_01.view;
import javax.sound.sampled.SourceDataLine;

import Aula02_01.business.Aluno;
import Aula02_01.business.Professor;

public class Principal {
    public static void main(String[] args) {
        
        //Instancia objeto do tipo Pessoa.
        Aluno aluno1 = new Aluno("MIchel", "mic@fatec", "ra123");   
        Aluno aluno2 = new Aluno("Théo", "sem email", "sem RA");    
         
        //Exibe mensagem de cumprimentar da pessoa.
        System.out.println(aluno1.cumprimentar());
        System.out.println(aluno2.cumprimentar());

        Professor professor1 = new Professor("Rubens Lara", "rl@fatec");
        System.out.println(professor1.cumprimentar());

        Professor professor2 = new Professor("Aritl", "2156151");
        System.out.println(professor2.cumprimentar("Dr."));
    }
    
}
