import javax.swing.JOptionPane;

public class C09EX01 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=37; aux++) {
			numerador = (38-aux)*(39-aux);
			denominador = aux;
			serie += numerador/denominador;
		}
		JOptionPane.showMessageDialog(null, String.format("Valor da S�rie = %.4f", serie), "S�RIES Matem�ticas", JOptionPane.INFORMATION_MESSAGE);
	}
}