package javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
        System.out.println("Nome: "+this.nome+"\nIdade: "+this.idade+"\nSexo: "+this.sexo+"\n");
    }
}
