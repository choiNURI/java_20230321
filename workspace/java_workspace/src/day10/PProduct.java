package day10;

public class PProduct {
	
	private String name;
	private int price;
	
	
	
	public PProduct() {}
	
	public PProduct(String name, int price) {
		this.name=name;
		this.price=price;
		
	}
	
	//삽입메서드
	public void insertPProduct(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	
	
	@Override
	public String toString() {
		return "PProduct [상품명=" + name + ", 가격=" + price + "]";
	}
	
	
	
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
	
	
	
//	//가격을 더하는 메서드 생성
//	public int sumsum() {
//		int sum = 0;
//		sum = sum + price;
//	   return sum;
//	  
//	}
	
	
		
}
