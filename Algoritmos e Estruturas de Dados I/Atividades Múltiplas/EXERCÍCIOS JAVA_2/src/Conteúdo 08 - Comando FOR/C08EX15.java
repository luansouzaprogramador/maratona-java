import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class C08EX15 {
	// Autor: Luan Marcelino
	public static void main(String[] args) {
		String nome, cargo, salarioStr, idadeStr, ehSenior, nomeMaiorSalario="", cargoMaiorSalario="", mediaVF, maiorSalarioVF;
		int i, idade=0, quantMenoresIdade=0;
		double salario=0, soma=0, maiorSalario=0;
		
		JOptionPane.showMessageDialog(null, "A seguir, informe o nome, o cargo, o sal�rio e a idade de 1000 funcion�rios.", "Empresa | Setor Financeiro", JOptionPane.INFORMATION_MESSAGE);
		
		for (i=1; i<=3; i++) {
			nome = JOptionPane.showInputDialog(null, "Informe o nome:", i+"� Funcion�rio", JOptionPane.QUESTION_MESSAGE);
			cargo = JOptionPane.showInputDialog(null, "Informe o cargo:", i+"� Funcion�rio", JOptionPane.QUESTION_MESSAGE);
			salarioStr = JOptionPane.showInputDialog(null, "Informe o salario:", i+"� Funcion�rio", JOptionPane.QUESTION_MESSAGE);
			salario = Double.valueOf(salarioStr);
			if (salario<0) {
				JOptionPane.showMessageDialog(null, "Valor inv�lido", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			idadeStr = JOptionPane.showInputDialog(null, "Informe a idade:", i+"� Funcion�rio", JOptionPane.QUESTION_MESSAGE);
			idade = Integer.valueOf(idadeStr);
			if (idade<0) {
				JOptionPane.showMessageDialog(null, "Valor inv�lido", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			if (salario>10000 && idade>50)
				ehSenior = "SIM";
			else
				ehSenior = "N�O";
			
			if (idade<=18) {
				soma += salario;
				quantMenoresIdade++;
			}
			
			JOptionPane.showMessageDialog(null, String.format("O empregado %s � S�NIOR = %s", nome, ehSenior), i+"� Funcion�rio", JOptionPane.INFORMATION_MESSAGE);
			
			if (i==1 || salario>maiorSalario) {
				maiorSalario = salario;
				nomeMaiorSalario = nome;
				cargoMaiorSalario = cargo;
			}
			
		}
		
		if (salario>0 && idade>0) {
			
			mediaVF = new DecimalFormat("R$ #,##0.00").format(soma/quantMenoresIdade);
			maiorSalarioVF = new DecimalFormat("R$ #,##0.00").format(maiorSalario);
			JOptionPane.showMessageDialog(null, String.format("M�dia dos sal�rios dos funcion�rios com at� 18 anos = %s"+
					"\n\nNome do funcion�rio que tem o maior sal�rio = %s\n\nCargo de %s = %s\n\nSal�rio de %s = %s",
					mediaVF, nomeMaiorSalario, nomeMaiorSalario, cargoMaiorSalario, nomeMaiorSalario, maiorSalarioVF), "Empresa | Setor Financeiro",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}