package day16;

public class Customer {

	
	/* 여행상품이 있습니다.
	 * 여행비용은 15세 이상은 100만원, 15세 미만은 50만원
	 * 고객 3명이 패키지 여행을 떠나려고 할 때
	 * 
	 * 1.비용계산
	 * 2.고객명단
	 * 
	 * 고객은 class로 생성, ArrayList로 추가
	 * 고객정보
	 * 이름 : 남예준, 나이:22, 비용:100
	 * 이름 : 유하민, 나이: 2, 비용:50
	 * 이름 : 최누리, 나이:24, 비용:100
	 * 총 여행비용 : 250
	 * 
	 * */
	
	private String name;
	private int age;
	private int expense;
	
	
	public void Customer() {}


	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		
		
		if(age > 15) {
			expense = 100;
		}else {
			expense = 50;
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getExpense() {
		return expense;
	}


	public void setExpense(int expense) {
		this.expense = expense;
	}


	@Override
	public String toString() {
		return "> 이름 :" + name + ", 나이:" + age + " 비용:" + expense ;
	}

	
	
	
	
	
	
}
