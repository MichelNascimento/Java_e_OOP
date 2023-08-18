package Aula02_01.business;
//classe finaly
abstract class Pessoa {    
    protected String nome;
    private String email;

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String cumprimentar(){
        return String.format("Olá, meu nome é %s.", nome);
    }

}
