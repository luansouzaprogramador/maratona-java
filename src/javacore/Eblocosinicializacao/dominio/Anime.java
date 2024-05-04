package javacore.Eblocosinicializacao.dominio;

public class Anime {
    // A inicializacao dos objetos acontece antes mesmo da execucao do construtor
    private String nome;
    private int[] episodios;

    {
        // Os blocos de inicializacao nao estaticos ou blocos de inicializacao de instancia sao executados antes dos construtores
        // e toda vez que uma instancia do objeto eh criada, alem de poderem ser inseridos em qualquer parte do codigo
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i=0; i<100; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime() {
        System.out.println("Dentro do construtor");
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

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
