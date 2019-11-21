package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String exp = scanner.nextLine();
		

		while( true ) {
			/*  코드를 완성 합니다 */
			System.out.print(">>");
						
			if (exp.equals("quit"))	
				break;	
		}
		
		String[] tokens = exp.split("");
		
		int a = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[2]);

		int result = 0;
		if(tokens[1].contentEquals("+")) {
			result = 10;
			System.out.println(">>" + result);
		}
		
		
		
		scanner.close();

	}

}
