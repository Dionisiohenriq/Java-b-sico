import javax.swing.JOptionPane;

public class Exer20 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome!");
		int ct = 1;
		double totais = 0;
		
		while (ct <= 12) {
			
			String salario = JOptionPane.showInputDialog("Insira seu sal�rio do m�s "+ ct);
			double valor = Double.parseDouble(salario);
			totais += valor;
			++ct;
		}
		double media = totais / 12;
		JOptionPane.showMessageDialog(null, "13 sal�rio do " + nome + " � " + media);
		System.exit(0);
	}

}
