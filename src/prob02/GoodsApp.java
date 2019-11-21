package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Goods[] goods = new Goods[COUNT_GOODS];

		
		for ( int i = 0 ; i < COUNT_GOODS ; i++)
		{
			System.out.print(">>");
			String input = scanner.nextLine();
			
			String[] tokens = input.split(" ");
			
			String name = tokens[0];
			int cost = Integer.parseInt(tokens[1]);
			int goodsCount = Integer.parseInt(tokens[2]);
			
			goods[i] = new Goods(name, cost, goodsCount);
		}

		for (Goods g : goods)
		{
			g.printGoods();
		}
		


		
		// 자원정리
		scanner.close();
	}
}
