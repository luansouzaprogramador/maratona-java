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

    public String nome;
    public int idade;
    public double[] salarios;

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
        double soma=0;
        for (double salario: salarios) {
            soma+=salario;
        }
        System.out.println("A media dos salarios do funcionario "+nome+" eh de R$"+soma/salarios.length);
    }
}
