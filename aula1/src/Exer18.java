import javax.swing.JOptionPane;

public class Exer18 {

	public static void main(String[] args) {

		// recebendo valores pela interface gr�fica
		String v1 = JOptionPane.showInputDialog("Insira o primeiro n�mero!");
		String v2 = JOptionPane.showInputDialog("Insira o segundo n�mero!");

		// convers�o dos valores
		int vl1 = Integer.parseInt(v1);
		int vl2 = Integer.parseInt(v2);

		// l�gica de programa��o
		String relatorio = "";

		if (vl1 > vl2) {
			relatorio += vl1;
		} else {
			if (vl1 < vl2) {
				relatorio += vl2;
			} else {
				relatorio = "iguais";
			}
		}
		JOptionPane.showMessageDialog(null, relatorio);
		System.exit(0);
	}

}
