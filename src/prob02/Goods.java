package prob02;

public class Goods {

	public Goods(String name, int price, int count) // 안써도 자동으로 생성됨
	{
		this.name = name;
		this.price = price;
		this.count = count;
	}  
	
	private String name;
	private int price;
	private int count;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
		
	public void printGoods()
	{
		System.out.println(name +"(가격 : "+ price +"원)이 "+ count +"개 입고 되었습니다.");	
		
	}
}
