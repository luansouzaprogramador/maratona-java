package javacore.Eblocosinicializacao.teste;

import javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        /*
        Passo a passo
        1. Alocado espaco em memoria para o objeto
        2. Cada atributo de classe eh criado e inicializado com valores default ou que forem passados
        3. O bloco de inicializacao eh executado
        4. O construtor eh executado
         */

        Anime anime = new Anime();
        Anime anime2 = new Anime("One Piece");

        for (int episodio: anime.getEpisodios()) {
            System.out.print(episodio+" ");
        }
        System.out.println();

        for (int episodio: anime2.getEpisodios()) {
            System.out.print(episodio+" ");
        }
        System.out.println();
    }
}
