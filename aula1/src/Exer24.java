import javax.swing.JOptionPane;

public class Exer24 {

	public static void main(String[] args) {
		String qtd = JOptionPane.showInputDialog("Digite a qtd de filhos!");
		int filhos = Integer.parseInt(qtd);
		String rel = "";
		
		for (int i = 1; i <= filhos; i++) {
			String nome = JOptionPane.showInputDialog("Digite o "+ i + " nome");
			String idade = JOptionPane.showInputDialog("Digite a "+ i + " idade");
			rel  += "nome= " + nome + " idade= " + idade + "\n";
		}
		JOptionPane.showMessageDialog(null, rel);
		System.exit(0);
	}

}
