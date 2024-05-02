import javax.swing.JOptionPane;

public class C09EX11F {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=100; aux++) {
			numerador = (2*aux - 1)*Math.pow(2, aux+1);
			denominador = Math.pow(5*aux-3, 2);
			serie += numerador/denominador;
		}
		
		serie = 5 * Math.sqrt(serie);
		JOptionPane.showMessageDialog(null, "Valor da S�rie F = "+serie, "S�RIES Matem�ticas", JOptionPane.INFORMATION_MESSAGE);
	}
}