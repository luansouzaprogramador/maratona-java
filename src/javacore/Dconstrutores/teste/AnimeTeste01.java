package javacore.Dconstrutores.teste;

import javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime("Akudama Drive", "TV", 12, "Acao");
        Anime anime3 = new Anime("_Akudama Drive", "_TV", 13, "_Acao", "Production IG");

        anime.imprime();
        anime2.imprime();
        anime3.imprime();
    }
}
