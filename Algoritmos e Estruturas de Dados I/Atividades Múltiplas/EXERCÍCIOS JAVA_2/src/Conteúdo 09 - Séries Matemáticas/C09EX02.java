import javax.swing.JOptionPane;

public class C09EX02 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=100; aux++) {
			numerador = aux;
			denominador = Math.pow(aux, 2)+(aux-1);
			serie += numerador/denominador;
		}
		JOptionPane.showMessageDialog(null, String.format("Valor da S�rie = %.4f", serie), "S�RIES Matem�ticas", JOptionPane.INFORMATION_MESSAGE);
	}
}