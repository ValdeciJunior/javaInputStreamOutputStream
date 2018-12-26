package principal;

import javax.swing.JOptionPane;

public class DejejaFelizNatal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "Sim";
		do {
			p = JOptionPane.showInputDialog("Você gostaria de receber uma mensagem?");
			
			if(p.equals("Não")) {
				JOptionPane.showMessageDialog(null, "Vai, diz que sim :(");
			}else {
				JOptionPane.showMessageDialog(null, "Feliz Natal,\n que o Menino Jesus possa nascer \n na manjedoura do coração de cada um ^^ \n By: Valdeci Junior @_junior_dev");
//				JOptionPane.showMessageDialog(null, "By: Valdeci Junior @_junior_dev");
			}
			
			
		}while(p.equals("Não"));
		
		

	}

}
