package javacore.Fmodificadoresestatico.dominio;

public class Anime {
    // A inicializacao dos objetos acontece antes mesmo da execucao do construtor
    private String nome;
    private static int[] episodios;

    // Os blocos de inicializacao estaticos sao executados apenas uma vez quando a classe eh carregada pela JVM
    // ou seja, antes mesmo de ter espaco em memoria, isso acontece para todos os atributos e metodos estaticos

    /*
        Passo a passo
        0. Bloco de inicializacao estatico e; atributos e metodos estaticos sao executados apenas uma vez, quando a JVM carregar a classe, na ordem que aparecem
        1. Alocado espaco em memoria para o objeto
        2. Cada atributo de classe eh criado e inicializado com valores default ou que forem passados
        3. O bloco de inicializacao eh executado
        4. O construtor eh executado
    */

    {
        System.out.println("Dentro do bloco de inicializao");
    }

    static {
        // Os blocos de inicializacao nao estaticos ou blocos de inicializacao de instancia sao executados antes dos construtores
        // e toda vez que uma instancia do objeto eh criada, alem de poderem ser inseridos em qualquer parte do codigo
        System.out.println("Dentro do bloco de inicializacao estatico");
        episodios = new int[100];
        for (int i=0; i<100; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime() {
        System.out.println("Dentro do construtor");

        for (int episodio: Anime.episodios) {
            System.out.print(episodio+" ");
        }
        System.out.println();
    }

    public Anime(String nome) {
        System.out.println("Dentro do construtor");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
