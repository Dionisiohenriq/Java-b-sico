import javax.swing.JOptionPane;

public class Exer21 {

	public static void main(String[] args) {

		String qtd = JOptionPane.showInputDialog("Insira a qtd de filhos!");
		int filhos = Integer.parseInt(qtd);
		int ct = 1;
		String rel = "";

		while (ct <= filhos) {
			String nome = JOptionPane.showInputDialog("Insira o nome do " + ct + " filho!");
			String idade = JOptionPane.showInputDialog("Insira o idade do " + ct + " filho!");
			rel += "nome = " + nome + " idade= " + idade + "\n";
			++ct;
		}
		
		JOptionPane.showMessageDialog(null, rel);
		System.exit(0);
		
	}

}
