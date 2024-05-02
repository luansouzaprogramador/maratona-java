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

        // Operadores logicos: && (and), || (or), ! (not)

        int idade = 29;
        double salario = 3500;
        boolean isDentroDaLeiMaiorQue30 = idade>30 && salario>=4612;
        boolean isDentroDaLeiMenorQueTrinta = idade<30 && salario>=3381;

        System.out.println("isDentroDaLeiMaiorQue30: "+isDentroDaLeiMaiorQue30);
        System.out.println("isDentroDaLeiMenorQueTrinta: "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaConrrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaConrrente>=valorPlaystation || valorTotalContaPoupanca>=valorPlaystation;

        System.out.println("isPlaystationCincoCompravel: "+isPlaystationCincoCompravel);

        // Operadores de atribuicao: = += -= *= /= %=
        double bonus = 1800;    // 1800
        bonus += 1000;          // 2800
        bonus -= 1000;          // 1800
        bonus *= 2;             // 3600
        bonus /= 2;             // 1800
        bonus %= 2;             // 0
        System.out.println(bonus);

        // Operadores unarios: ++ --
        int contador = 0;
        contador+=1;        // contador = contador+1;
        contador++;         // contador = contador+1;
        contador--;         // contador = contador-1;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);

        int contador3 = 0;
        System.out.println(++contador3);
    }
}
