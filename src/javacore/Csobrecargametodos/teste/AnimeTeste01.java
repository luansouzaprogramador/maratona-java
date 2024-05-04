package javacore.Csobrecargametodos.teste;

import javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "TV", 12);
        anime.imprime();
        anime.init("_Akudama Drive", "_TV 2", 13, "_Acao");
        anime.imprime();
    }
}
