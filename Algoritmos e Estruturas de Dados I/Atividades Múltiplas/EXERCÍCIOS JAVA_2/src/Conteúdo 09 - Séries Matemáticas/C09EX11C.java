import javax.swing.JOptionPane;

public class C09EX11C {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=100; aux++) {
			numerador = (2*aux + 1)*Math.sqrt(4*aux + 1);
			denominador = Math.pow(5, aux);
			serie += numerador/denominador;
		}
		
		serie = Math.pow(serie, 2);
		JOptionPane.showMessageDialog(null, String.format("Valor da S�rie C = %.3f", serie), "S�RIES Matem�ticas", JOptionPane.INFORMATION_MESSAGE);
	}
}