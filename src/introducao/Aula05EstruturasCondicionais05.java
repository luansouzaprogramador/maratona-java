package introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana considerando 1 como domingo
        byte dia = 1;
        String diaSemana;

        // O switch...case aceita apenas variaveis do tipo: byte, short, int, char, String, enum
        switch (dia) {
            case 1:
                diaSemana = "domingo";
                break;
            case 2:
                diaSemana = "segunda";
                break;
            case 3:
                diaSemana = "terca";
                break;
            case 4:
                diaSemana = "quarta";
                break;
            case 5:
                diaSemana = "quinta";
                break;
            case 6:
                diaSemana = "sexta";
                break;
            case 7:
                diaSemana = "sabado";
                break;
            default:
                diaSemana = "inexistente";
                break;
        }

        System.out.println("Dia da semana: "+diaSemana);

        char opcao = 'B';
        String sexo;

        switch (opcao) {
            case 'M':
                sexo = "masculino";
                break;
            case 'F':
                sexo = "feminino";
                break;
            default:
                sexo = "outros";
                break;
        }
        System.out.println("Sexo: "+sexo);
    }
}
