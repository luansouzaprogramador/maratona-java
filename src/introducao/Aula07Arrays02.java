package introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /*
        Valores padrao de inicializacao
        byte, short, int, long  -> 0
        float, double           -> 0.0
        char                    -> '\u0000' ' '
        boolean                 false
        String                  null
         */

        String[] nomes = new String[3];
        nomes[0] = "Luan";
        nomes[1] = "Marly";
        nomes[2] = "Dominic";

        for (int i=0; i<nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
