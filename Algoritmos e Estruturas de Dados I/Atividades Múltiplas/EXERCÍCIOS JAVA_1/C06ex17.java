import java.util.Scanner;

public class C06ex17 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String temCursoTecnico, temCursoSuperior, temMenosDe3AnosDeExperiencia, eCriativo, prefereLiderar, prefereTrabalharSozinho, eAutordidata, aceitariaRemuneracaoInicial1500, soTrabalhariaEmBH;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Afim de conhecer melhor o seu perfil profissional, responda VERDADEIRO ou FALSO para cada uma das perguntas abaixo.");
		System.out.print("\nVoc� tem curso t�cnico de programa��o? ");
		temCursoTecnico = teclado.nextLine();
		System.out.print("Voc� tem curso superior de programa��o? ");
		temCursoSuperior = teclado.nextLine();
		System.out.print("Voc� tem menos de 3 anos de experi�ncia em programa��o? ");
		temMenosDe3AnosDeExperiencia = teclado.nextLine();
		System.out.print("Voc� se considera uma pessoa criativa? ");
		eCriativo = teclado.nextLine();
		System.out.print("Voc� prefere liderar a ser liderado? ");
		prefereLiderar = teclado.nextLine();
		System.out.print("Voc� prefere trabalhar sozinho a trabalhar em equipe? ");
		prefereTrabalharSozinho = teclado.nextLine();
		System.out.print("Voc� � autodidata (aprende sozinho)? ");
		eAutordidata = teclado.nextLine();
		System.out.print("Voc� aceitaria uma remunera��o inicial de R$1500,00? ");
		aceitariaRemuneracaoInicial1500 = teclado.nextLine();
		System.out.print("Voc� s� aceitaria trabalhar em escrit�rios da empresa dentro da grande BH? ");
		soTrabalhariaEmBH = teclado.nextLine();
		
		if (temCursoTecnico.equalsIgnoreCase("VERDADEIRO")) {
			
		}
	}
}