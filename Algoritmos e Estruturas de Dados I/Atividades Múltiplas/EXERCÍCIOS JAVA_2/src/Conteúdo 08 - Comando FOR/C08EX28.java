import javax.swing.JOptionPane;

public class C08EX28 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int x, soma=0;
		double media;
		
		System.out.println("N�meros triangulares entre 1 e 1000:\n");
		for (x=1; x*(x+1)*(x+2)<=1000; x++) {
			System.out.print(x*(x+1)*(x+2)+"   ");
			soma += x*(x+1)*(x+2);
		}
		
		media = (double) soma/(x-1);
		JOptionPane.showMessageDialog(null, String.format("A m�dia de todos os n�meros triangulares entre 1 e 1000 � igual a %1.1f", media), "N�meros Triangulares", JOptionPane.INFORMATION_MESSAGE);
	}
}