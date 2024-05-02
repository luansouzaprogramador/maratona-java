package introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 ate 1000000

        // Funciona, mas se a contagem comecasse do 1, o programa iria imprimir todos os numeros impares
        for (int i=0; i<=1000000; i+=2) {
            System.out.println(i);
        }

        // Permite maior flexibilidade do codigo
        for (int i=1; i<=10; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
