import javax.swing.JOptionPane;

public class C09EX12 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double denominador, serie=0;
		
		for (int aux=1; aux<=10000; aux++) {
			denominador = 2*aux - 1;
			if (aux%2 == 0)
				serie -= 1/denominador;
			else
				serie += 1/denominador;
		}
		
		serie *= 4;
		JOptionPane.showMessageDialog(null, String.format("Valor da S�rie de PI = %.4f", serie), "S�RIES Matem�ticas", JOptionPane.INFORMATION_MESSAGE);
	}
}