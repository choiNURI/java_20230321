package day10;

public class 상속02 {

	public static void main(String[] args) {
		
		/*
		 * 오버라이딩 : 부모클래스에게 물려받은 메서드를 재정의하는 것.
		 * - 부모클래스의 메서드와 선언부가 일치해야 한다.
		 * - 접근제한자는 같거나 더 넓은 범위의 접근제한자를 써야 한다.
		 *   => 범위를 축소할 수는 없다.
		 * */
		
		Dog d = new Dog();
		d.info();
		d.howl();
		d.setName("초이");
		d.info();
		d.howl();
		
		//Cat c = new Cat(); //기본생성자 없음
		
		 Cat c = new Cat("야옹이","고양이과");
		 c.setName("나비");
		 c.info();
		 c.howl();
		 
		 Tiger t = new Tiger();
		 t.info();
		 t.howl();
		
		 MINT m = new MINT("민영이","고양이과");
		 m.info();
		 m.howl();

	}

}

class Animal{
	private String name;
	private String category;
	
	
	public Animal() {}
	public Animal(String name,String category) {
		this.name=name;
		this.category=category;
		
	}
	
	

	public void info() {
		System.out.println("-------------------");
		System.out.println("이름 : "+name);
		System.out.println("분류 : "+category);
	}
	
	//울음소리
	public void howl() {
		System.out.println(">>> "+name+" 울음소리 >>>"); 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}



 class Dog extends Animal{
	 public Dog() {
		 setName("강아지");
		 setCategory("개과");
		 
	 }

	@Override
	public void howl() {
		super.howl();
		System.out.println(" : 앙앙!왕왕!알알!");
		System.out.println("-------------------");
		System.out.println();
	}
 }
 
 
 class Cat extends Animal{
	 public Cat(String name, String category) {
		 super.setName(name);
		 super.setCategory(category);
		 
	 }

	@Override
	public void howl() {
		super.howl();
		System.out.println(" : 미야야아오오옹~~");
		System.out.println("-------------------");
		System.out.println();
	}
	 
 }
 
 
 class Tiger extends Animal{
	 public Tiger() {
		 setName("호랑이");
		 setCategory("고양이과");		 
	 }	
	public void howl() {
		super.howl();
		System.out.println(" : 어!!!!흥!!!!");
		System.out.println("-------------------");
		System.out.println();
	}	 
 }
 
 class MINT extends Animal{
	 public MINT(String name, String category) {
		 /// super class 생성자 호출
		 super(name,category);
	 }

	@Override
	public void howl() {
		super.howl();
		System.out.println(" : 우리 뭐 안먹어?");
		System.out.println("-------------------");
		System.out.println();
	}
 }
 
