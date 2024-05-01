package introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /*
        Tipos primitivos em Java: byte, short, int, long, float, double, boolean, char


        Familia         Tipo primitivo      Wrapper class       Tamanho     Intervalo                                               Valor padrao
        Inteiros        byte                Byte                1 byte      [-128; 127]                                             0
                        short               Short               2 bytes     [-32.768; 32.767]                                       0
                        int                 Integer             4 bytes     [-2.147.483.648; 2.147.483.647]                         0
                        long                Long                8 bytes     [-9.223.372.036.854.775.808; 9.223.372.036.854.775.807] 0

        Reais                                                                                               Precisao
                        float               Float               4 bytes     [-3,4028E+38; 3,4028E+38]       6-7 digitos             0.0f
                        double              Double              8 bytes     [-1,7976E+308; 1,7976E+308]     15 digitos              0.0d

        Logico          boolean             Boolean             1 bit                                                               false

        Literais        char                Caractere           2 bytes                                                             \u0000
                                            String              1 byte/cada
         */

        byte idadeByte = 127;
        short idadeShort = 32000;
        int idadeInt = (int) 10000000000L;
        long numeroLong = (long) 155.23F;
        float salarioFloat = (float) 2500.0D;
        double salarioDouble = 2000.0D;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';  // 'A' = 65 = '\u0041'
        String nome = "Luan";

        System.out.println("A idade eh "+idadeInt+" anos");
        System.out.println("boolean: "+true);
        System.out.println("char: "+caractere);
        System.out.println("salario: "+salarioFloat);
        System.out.println("Numero grande: "+numeroLong);
        System.out.println("Oi, meu nome eh "+nome);
    }
}
