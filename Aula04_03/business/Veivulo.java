package Aula04_03.business;

abstract class Veivulo {
    private String nome;
    private String fabricante;
    private int ano;
    protected int velocidade;

    public Veivulo(String nome, String fabricante, int ano) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.ano = ano;
    }

    public String getNome() {        return nome;    }
    public String getFabricante() {        return fabricante;    }
    public int getAno() {        return ano;    }
    public int getVelocidade() {        return velocidade;    }


    public void acelerar(){         velocidade += 5;    }
    public void desacelerar (){        velocidade -= 5;    }
    public void parar(){        velocidade = 0;    }

    @Override
    public String toString(){
        return String.format("Veiculo: %s /  velocidade atual: %d km/h", nome, velocidade);
    }
{

}

    

    
}
