import javax.swing.JOptionPane;

public class C09EX10F {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=100; aux++) {
			numerador = Math.pow(aux, 2);
			denominador = Math.pow(2*aux, 2);
			serie += numerador/denominador;
		}
		
		JOptionPane.showMessageDialog(null, String.format("Valor da S�rie = %.3f", serie), "S�RIES Matem�ticas", JOptionPane.INFORMATION_MESSAGE);
	}
}