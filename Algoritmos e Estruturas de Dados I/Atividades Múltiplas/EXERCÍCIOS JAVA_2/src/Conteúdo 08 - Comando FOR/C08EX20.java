import javax.swing.JOptionPane;

public class C08EX20 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nStr;
		int i, n;
		double termo, soma=0;
		
		nStr = JOptionPane.showInputDialog(null, "Informe a quantidade de termos:", "Progress�o Num�rica", JOptionPane.QUESTION_MESSAGE);
		n = Integer.valueOf(nStr);
		
		if (n>0) {
			System.out.println("Progress�o Num�rica\n");
			for (i=1; i<=n; i++) {
				termo = Math.pow(2, (i-1));
				soma += termo;
				System.out.println(i+"� Termo = "+termo);
			}
			
			JOptionPane.showMessageDialog(null, String.format("Soma dos %d primeiros termos: %1.0f", (i-1), soma), "Progress�o Num�rica", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Valor inv�lido", "ERRO", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}