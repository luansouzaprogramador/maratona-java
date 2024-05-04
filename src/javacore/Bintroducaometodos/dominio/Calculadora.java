package javacore.Bintroducaometodos.dominio;

public class Calculadora {
    // As funcoes somaDoisNumeros e subtraiDoisNumeros nao tem um valor de retorno
    public void somaDoisNumeros() {
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros(int num1, int num2) {
        double resultado=0;
        if (num2!=0) {
            resultado = num1/num2;
        }
        return resultado;
    }

    public double divideDoisNumeros2(int num1, int num2) {
        if (num2==0) {
            return 0;
        }
        return num1/num2;
    }

    public double divideDoisNumeros3(int num1, int num2) {
        if (num2==0) {
            return 0;
        } else {
            return num1/num2;
        }
    }

    public void imprimeDivisaoDeDoisNumeros(int num1, int num2) {
        if (num2==0) {
            System.out.println("Nao existe divisao por zero");
        } else {
            System.out.println(num1/num2);
        }
    }

    public void imprimeDivisaoDeDoisNumeros2(int num1, int num2) {
        if (num2==0) {
            System.out.println("Nao existe divisao por zero");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 3;
        num2 = 4;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 = "+num1+", num2 = "+num2);
    }

    public void somaArray(int[] numeros) {
        int soma=0;
        for (int numero: numeros) {
            soma+=numero;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) { // Quando o metodo tem mais de um parametro, o Varargs precisa vir na ultima posicao
        int soma=0;
        for(int numero: numeros) {
            soma+=numero;
        }
        System.out.println(soma);
    }
}
