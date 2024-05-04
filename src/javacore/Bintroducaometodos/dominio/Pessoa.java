package javacore.Bintroducaometodos.dominio;

public class Pessoa {
    // Uma das formas de adquirir um baixo acoplamento eh utilizar modificadores de acesso privado
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(nome+", "+idade+" anos");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade<0) {
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
