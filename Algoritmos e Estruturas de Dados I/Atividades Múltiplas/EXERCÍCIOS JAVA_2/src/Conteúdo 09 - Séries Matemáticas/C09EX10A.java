import javax.swing.JOptionPane;

public class C09EX10A {
	// Autor: Luan Marcelino de Souza
	public static void main(String [] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=100; aux++) {
			numerador = aux;
			denominador = Math.sqrt(2*aux);
			serie += numerador/denominador;
		}
		
		JOptionPane.showMessageDialog(null, String.format("Valor da S�rie A = %.3f", serie), "S�RIES Matem�ticas", JOptionPane.INFORMATION_MESSAGE);
	}
}