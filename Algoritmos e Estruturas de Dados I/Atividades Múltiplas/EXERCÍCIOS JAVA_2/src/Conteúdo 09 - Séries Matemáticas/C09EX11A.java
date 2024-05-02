import javax.swing.JOptionPane;

public class C09EX11A {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=100; aux++) {
			numerador = aux + (7*aux-6);
			denominador = Math.pow(2, 2*(aux-1));
			serie += numerador/denominador;
		}
		
		serie = Math.cbrt(serie);
		JOptionPane.showMessageDialog(null, String.format("Valor da S�rie A = %.3f", serie), "S�RIES Matem�ticas", JOptionPane.INFORMATION_MESSAGE);
	}
}