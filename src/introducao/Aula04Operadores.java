package introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores aritmeticos: + - * / %
        int n1;
        int n2;
        double resultado;
        n1 = 10;
        n2 = 20;
        resultado = n1/n2; // o resultado da divisao entre dois numeros inteiros eh inteiro

        System.out.println(resultado);

        // Observacao: comportamento do sinal de soma entre valores numericos e Strings
        System.out.println(n1+n2+" Valor "+n1+n2);

        int resto = 20%2;
        System.out.println(resto);

        // Operadores relacionais: > < >= <= == !=

        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10==20;
        boolean isDezIgualDez = 10==10;
        boolean isDezDiferenteDez = 10!=10;
        boolean isZeroIgualZero = 0=='\u0000';

        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("isDezIgualDez: "+isDezIgualDez);
        System.out.println("isDezDiferenteDez: "+isDezDiferenteDez);
        System.out.println("isZeroIgualZero: "+isZeroIgualZero);
    }
}
