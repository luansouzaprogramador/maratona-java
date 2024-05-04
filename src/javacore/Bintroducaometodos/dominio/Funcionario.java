package javacore.Bintroducaometodos.dominio;

public class Funcionario {
    /*
    Crie uma classe Funcionario com os seguintes atributos
    nome
    idade
    salario (tres salarios devem ser guardados)

    Crie dois metodos
    1. Para imprimir os dados
    2. Para tirar a media dos salarios e imprimir o resultado
     */

    private String nome;
    private int idade;
    private double[] salarios;
    private double mediaSalarios;

    public void imprime() {
        System.out.print("Nome: "+nome+"\nIdade: "+idade+"\nSalarios: ");
        if (salarios!=null) {
            for (double salario: salarios) {
                System.out.print(salario+" ");
            }
            System.out.println();
            imprimeMediaSalarial();
        }
    }

    public void imprimeMediaSalarial() {
        if (salarios==null) {
            return;
        }
        for (double salario: salarios) {
            mediaSalarios+=salario;
        }
        mediaSalarios /= salarios.length;
        System.out.println("A media dos salarios do funcionario "+nome+" eh de R$"+mediaSalarios);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMediaSalarios() {
        return mediaSalarios;
    }
}
