package introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        /*
        idade<15                -> categoria infantil
        idade>=15 && idade<18   -> categoria juvenil
        idade>=18               -> categoria adulto

        Observacao: todas as variaveis com escopo local devem ser obrigatoriamente inicializadas antes de serem utlizadas
         */

        int idade=15;
        String categoria;
        if (idade<15) {
            categoria = "Categoria infantil";
        } else if (idade<18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);

        // Podemos substituir os if...else por um operador ternario, porem nesse caso nao eh recomendado, pois eh dificil de ler
        String categoria2 = idade<15 ? "Categoria infantil" : idade<18 ? "Categorial juvenil" : "Categoria adulto";
        System.out.println(categoria2);
    }
}
