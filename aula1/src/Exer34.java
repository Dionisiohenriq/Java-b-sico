
public class Exer34 {

	public static void main(String[] args) {
		
		int[] colecao = new int[5];
		
		System.out.println(colecao.length);
		
		for (int i = 0; i < colecao.length; i++) {
			colecao[i] = i;
		}
		
		for (int i = 0; i < colecao.length; i++) {
			System.out.println(colecao[i]);
		}
	}

}
