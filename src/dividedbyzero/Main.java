package dividedbyzero;

public class Main {
	 
	 /**
	 * @param args the command line arguments
	 */
	 public static void main(String[] args) {
		 try {
	 System.out.println(3/0);
	} catch (ArithmeticException e) {
		System.out.printf("捕获的运行异常：%s\n", e.getMessage());
		
	}
}
}
