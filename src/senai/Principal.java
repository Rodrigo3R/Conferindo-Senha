package senai;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		String senhaPrincipal = "123456";
		String senhaQualquer = "";
		
		boolean confere = false;
		
		while(confere == false) {
			senhaQualquer = JOptionPane.showInputDialog("Digite a senha secreta");
			
			if(senhaQualquer.equals(senhaPrincipal)) {
				confere = true;
				JOptionPane.showMessageDialog(null, "Senha correta");
			}
			else {
				JOptionPane.showMessageDialog(null, "Senha incorreta");
			}
		}
		
	}

}
