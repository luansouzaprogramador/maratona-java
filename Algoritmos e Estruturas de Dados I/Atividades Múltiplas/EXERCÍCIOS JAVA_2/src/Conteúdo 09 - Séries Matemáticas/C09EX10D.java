import javax.swing.JOptionPane;

public class C09EX10D {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<= 100;aux++) {
			numerador = aux+(aux-1);
			denominador = Math.pow(aux,2);
			serie += numerador/denominador;
		}
		
		JOptionPane.showMessageDialog(null, String.format("Valor da S�rie D = %.3f", serie), "S�RIES Matem�ticas", JOptionPane.INFORMATION_MESSAGE);
	}
}