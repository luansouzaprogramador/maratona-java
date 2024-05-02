package introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch...case e dados os valores de 1 a 7, imprima se eh dia util ou final de semana
        // Considerando 1 como domingo
        byte dia = 5;
        String resposta = switch(dia) {
            case 1, 7 -> "Final de semana";
            case 2, 3, 4, 5, 6 -> "Dia util";
            default -> "Dia nao existente";
        };

        System.out.println(resposta);
    }
}
