package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1, num2;
        num1 = 1;
        num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do CalculadoraTeste04");
        System.out.println("num1 = "+num1+", num2 = "+num2);

        // A variavel original do tipo primitivo nunca eh alterada independente do que aconteca dentro do metodo, pois eh passado uma copia de seus valores
    }
}
