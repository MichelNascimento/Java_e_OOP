package Aula04_03.business;

public class Carro extends Veivulo {
    private int quantidadePortas;

    public int getQuantidadePortas() {        return quantidadePortas;    }

    public Carro(String nome, String fabricante, int ano) {
        super(nome, fabricante, ano);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void acelerar(){
        velocidade += 10;
    }
    
   
}
