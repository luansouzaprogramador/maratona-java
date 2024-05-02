package introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario>5000
        // Operador ternario: (condicao) ? verdadeiro:falso;

        double salario = 6000;
        String resultado = salario>5000 ? "Eu vou doar 500,00 pro DevDojo" : "Ainda nao tenho condicoes, mas vou ter!";
        System.out.println(resultado);

        boolean possoDoar = salario>5000; // boolean possoDoar = salario>5000 ? true : false
        System.out.println(possoDoar);
    }
}
