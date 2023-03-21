package product;

public class Order extends Product {
	
	//menu랑 price는 상속받은 상태 get,set을 이용해 사용
	private int count;
	private int total;
	
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	//하나의주문
	public void print() {
		//상속받은 값을 가져올 때 super를 쓴다.
		System.out.println(super.getMenu()+":"+super.getPrice());
		System.out.println(count+"개 주문 => 금액:"+total);
	}
	
	

}
