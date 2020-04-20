
public class Exer26 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			
			if (i == 5) {
				continue;
			}
			System.out.println("->processando" + i);
		}
		System.out.println("terminando o programa...");
	}

}
