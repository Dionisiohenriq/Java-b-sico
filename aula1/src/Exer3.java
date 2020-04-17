import javax.swing.JOptionPane;

public class Exer3 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Olá mundo!");
		String pergunta = JOptionPane.showInputDialog("Qual seu objetivo?!");
		JOptionPane.showMessageDialog(null, pergunta);
	}

}
