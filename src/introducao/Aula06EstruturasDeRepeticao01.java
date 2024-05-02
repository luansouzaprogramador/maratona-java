package introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do-while, for

        int cont=0;
        while (cont<10) {
            System.out.println(cont);
            cont++;
        }

        cont=0;
        while (cont<10) {
            System.out.println(cont++);
        }

        cont=0;
        while (cont<10) {
            System.out.println(++cont);
        }

        cont=0;
        do {
            System.out.println("Dentro do do-while: "+ ++cont);
        } while(cont<10);

        // A principal diferenca entre as duas estruturas acima eh que no while o teste eh feita no inicio,
        // enquanto no do..while o teste eh feito no final, fazendo com que o do-while sempre execute ao menos uma vez

        for (int i=0; i<10; i++) {
            System.out.println("for "+i);
        }
    }
}
