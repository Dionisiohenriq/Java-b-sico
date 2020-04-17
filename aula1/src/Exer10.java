import javax.swing.JOptionPane;

public class Exer10 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String sobreNome = JOptionPane.showInputDialog("Digite seu sobrenome");
		String completo = nome + " " + sobreNome;
		JOptionPane.showMessageDialog(null, completo);
		System.exit(0);
	}

}
