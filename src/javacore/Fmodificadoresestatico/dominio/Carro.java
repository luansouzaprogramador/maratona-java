package javacore.Fmodificadoresestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMax;
    /*
    Modificador de acesso estatico vai fazer o atributo pertencer a classe e todos os objetos vao compartilhar o mesmo valor
    Ao alterar o valor de um atributo estatico por meio de uma instancia, os atributos de todos objetos terao o mesmo valor
    Alem disso, podemos modificar a velocidadeLimite mesmo sem a criacao de um objeto, pois

    Nao eh possivel acessar atributos de instancia por meio de metodos estaticos, uma vez que metodos estaticos sao executados independentemente da existencia de um objeto
    Logo, podemos criar um metodo estatico somente se ele nao acessar atributos de instancia
     */

    public static double velocidadeLimite = 250;

    public Carro() {
    }

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime() {
        System.out.println("Nome: "+nome+"\nVelocidade maxima: "+velocidadeMax+"\nVelocidade limite: "+Carro.velocidadeLimite+"\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
