package product;


public class Product {

	private String menu;
	private int price;
	
	
	
	
	public Product() {}
	
	//생성자는 굳이 없어도 됨. set을 쓰면되거든 하지만 명령어가 넘 길어져서....
	//new했을때 간단하게 값을가져오려고 쓰는거지 굳이 없어두된다.
	public Product(String menu, int price) {
		this.menu=menu;
		this.price=price;
	}

	
	
	
	
	
	
	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [menu=" + menu + ", price=" + price + "]";
	}

	
	
	
	
}


