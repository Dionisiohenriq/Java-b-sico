
public class Exer15 {

	public static void main(String[] args) {

		String texto = "1";
		// String para tipos primitivos
		byte v1 = Byte.parseByte(texto);
		System.out.println(v1);

		short v2 = Short.parseShort(texto);
		System.out.println(v2);

		int v3 = Integer.parseInt(texto);
		System.out.println(v3);

		long v4 = Long.parseLong(texto);
		System.out.println(v4);

		float v5 = Float.parseFloat(texto);
		System.out.println(v5);

		double v6 = Double.parseDouble(texto);
		System.out.println(v6);

		// Tipos primitivos para String
		texto = String.valueOf(v1);
		System.out.println(texto);

		texto = String.valueOf(v2);
		System.out.println(texto);

		texto = String.valueOf(v3);
		System.out.println(texto);

		texto = String.valueOf(v4);
		System.out.println(texto);

		texto = String.valueOf(v5);
		System.out.println(texto);

		texto = String.valueOf(v6);
		System.out.println(texto);

		Typetester t = new Typetester();
		t.printType(texto);
	}

}

class Typetester {
	void printType(String texto) {
		System.out.println(texto + " is an byte");
	}

	void printType(int x) {
		System.out.println(x + " is an int");
	}

	void printType(float x) {
		System.out.println(x + " is an float");
	}

	void printType(double x) {
		System.out.println(x + " is an double");
	}

	void printType(char x) {
		System.out.println(x + " is an char");
	}
}