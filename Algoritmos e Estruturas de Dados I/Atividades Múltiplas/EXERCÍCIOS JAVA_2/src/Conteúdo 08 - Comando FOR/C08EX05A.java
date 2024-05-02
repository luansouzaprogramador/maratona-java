import javax.swing.JOptionPane;

public class C08EX05A {
	// Luan Marcelino de Souza
	public static void main(String[] args) {
		String vencedor="", votoStr;
		int voto, luan=0, taissa=0, sophia=0, votosNulos=0, votosValidos=0;
		
		JOptionPane.showMessageDialog(null, "A seguir, digite 1 para LUAN, 2 para TAISSA ou 3 para SOPHIA.",
				"Eleição", JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=1; i<=100; i++) {
			votoStr = JOptionPane.showInputDialog(null, "Informe seu voto:", i+"ª pessoa votando", JOptionPane.QUESTION_MESSAGE);
			voto = Integer.valueOf(votoStr);
			
			if (voto!=1 && voto!=2 && voto!=3) {
				votosNulos++;
			}
			else {
				votosValidos++;
			}
			
			switch (voto) {
				case 1:
					luan++;
					break;
				case 2:
					taissa++;
					break;
				case 3:
					sophia++;
					break;
			}
		}
		
		if (votosNulos>votosValidos) {
			JOptionPane.showMessageDialog(null, "A eleição foi anulada, pois a quantidade de votos nulos superou a quantidade de votos válidos.",
					"Resultado da Eleição | 1° Turno", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			votosNulos=0;
			votosValidos=0;
			if ((luan==taissa && taissa==sophia && luan>0) || (luan==taissa && luan>sophia) || (luan==sophia && luan>taissa) || (taissa==sophia && taissa>luan)) {
				if (luan==taissa && taissa==sophia && luan>0) {
					JOptionPane.showMessageDialog(null, "A seguir, digite 1 para LUAN, 2 para TAISSA ou 3 para SOPHIA.",
							"Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
				} else if (luan==taissa && luan>sophia) {
					JOptionPane.showMessageDialog(null, "A seguir, digite 1 LUAN ou 2 para TAISSA.",
							"Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
				} else if (luan==sophia && luan>taissa) {
					JOptionPane.showMessageDialog(null, "A seguir, digite 1 para LUAN ou 3 SOPHIA.",
							"Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "A seguir, digite 2 para TAISSA ou 3 para SOPHIA",
							"Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
				}
				
				for (int i=1; i<=100; i++) {
					votoStr = JOptionPane.showInputDialog(null, "Informe seu voto:", i+"ª pessoa votando", JOptionPane.QUESTION_MESSAGE);
					voto = Integer.valueOf(votoStr);
					
					if (luan==taissa && taissa==sophia && luan>0) {
						switch (voto) {
							case 1:
								luan++;
								votosValidos++;
								break;
							case 2:
								taissa++;
								votosValidos++;
								break;
							case 3:
								sophia++;
								votosValidos++;
								break;
							default:
								votosNulos++;
								break;
						}
					} else if (luan==taissa && luan>sophia) {
						switch (voto) {
							case 1:
								luan++;
								votosValidos++;
								break;
							case 2:
								taissa++;
								votosValidos++;
								break;
							default:
								votosNulos++;
								break;
						}
					} else if (luan==sophia && luan>taissa) {
						switch (voto) {
							case 1:
								luan++;
								votosValidos++;
								break;
							case 3:
								sophia++;
								votosValidos++;
								break;
							default:
								votosNulos++;
								break;
						}
					} else {
						switch (voto) {
							case 2:
								taissa++;
								votosValidos++;
								break;
							case 3:
								sophia++;
								votosValidos++;
								break;
							default:
								votosNulos++;
								break;
						}
					}
				}
				
				if (votosNulos>votosValidos) {
					JOptionPane.showMessageDialog(null, "A eleição foi anulada, pois a quantidade de votos nulos superou"+
							" a quantidade de votos válidos.", "Resultado da Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					if ((luan==taissa && taissa==sophia && luan>0) || (luan==taissa && luan>sophia) || (luan==sophia && luan>taissa) || (taissa==sophia && taissa>luan)) {
						JOptionPane.showMessageDialog(null, "A eleição foi anulada, pois houve empate no 2° turno.",
								"Resultado da Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						if (luan>taissa && luan>sophia) {
							vencedor = "LUAN";
						}
						if (taissa>luan && taissa>sophia) {
							vencedor = "TAISSA";
						}
						if (sophia>luan && sophia>taissa) {
							vencedor = "SOPHIA";
						}
						
						if (luan==taissa && taissa==sophia && luan>0) {
							JOptionPane.showMessageDialog(null, String.format("Quantidade de votos para cada candidato:\n\nLUAN = %d"+
									"\nTAISSA = %d\nSOPHIA = %d\n\nVencedor = %s", luan, taissa, sophia, vencedor),
									"Resultado da eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
						} else if (luan==taissa && luan>sophia) {
							JOptionPane.showMessageDialog(null, String.format("Quantidade de votos para cada candidato:\n\nLUAN = %d"+
									"\nTAISSA = %d\n\nVencedor = %s", luan, taissa, vencedor),
									"Resultado da eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
						} else if (luan==sophia && luan>taissa) {
							JOptionPane.showMessageDialog(null, String.format("Quantidade de votos para cada candidato:\n\nLUAN = %d"+
									"\nSOPHIA = %d\n\nVencedor = %s", luan, sophia, vencedor),
									"Resultado da eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, String.format("Quantidade de votos para cada candidato:"+
									"\n\nTAISSA = %d\nSOPHIA = %d\n\nVencedor = %s", taissa, sophia, vencedor),
									"Resultado da eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
						}
					}
				}
			}
			else {
				if (luan>taissa && luan>sophia) {
					vencedor = "LUAN";
				}
				if (taissa>luan && taissa>sophia) {
					vencedor = "TAISSA";
				}
				if (sophia>luan && sophia>taissa) {
					vencedor = "SOPHIA";
				}
				JOptionPane.showMessageDialog(null, String.format("Quantidade de votos para cada candidato:\n\nLUAN = %d"+
						"\nTAISSA = %d\nSOPHIA = %d\n\nVencedor = %s", luan, taissa, sophia, vencedor), "Resultado da eleição | 1° Turno",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}