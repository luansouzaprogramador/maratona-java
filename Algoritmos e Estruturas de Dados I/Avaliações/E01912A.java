//Autor: Luan Marcelino de Souza

import javax.swing.JOptionPane;
public class E01912A {
	public static void main(String[] args) {
		String xStr;
		double x, y, w, z;

		xStr = JOptionPane.showInputDialog(null, "y = 4x^3 - 13/3x + 2\nw = 10y - (6x-1)^(1/7)\nz = (5 + (3y+4w+x^4)^(1/3))^(1/2)\n\nInforme o valor de x e obtenha os valores de y, w e z correspondentes.", "Seja as funções:", JOptionPane.QUESTION_MESSAGE);
		x = Double.valueOf(xStr);

		y = 4*Math.pow(x,3) - 13/3f*x + 2;
		w = 10*y - Math.pow(6*x-1,1/7f);
		z = Math.sqrt(5 + Math.cbrt(3*y+4*w+Math.pow(x,4)));

		JOptionPane.showMessageDialog(null, String.format("y = %1.1f\nw = %1.1f\nz = %1.1f", y, w, z), "Resultados", JOptionPane.INFORMATION_MESSAGE);
	}
}