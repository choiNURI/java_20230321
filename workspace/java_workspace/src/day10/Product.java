package day10;

import java.util.Arrays;
import java.util.Scanner;

public class Product {

	/*
	 * product 클래스 : 상품을 등록하는 클래스
	 * 상품명, 가격
	 * 상품등록 메서드 => inserProduct
	 * 출력메서드 = toString으로 출력
	 * getter, setter 만들기
	 * 
	 * */
	
	Scanner scn = new Scanner(System.in);
	
	
	private String productName;
	private int productPrice;
	private String[] product = new String[10];
	
	
	
	

	
	
	
	
//	@Override
//	public String toString() {
//		return "Product [productName=" + productName + ", productPrice=" + productPrice+"]";
//	}
	
	
	public void printProduct() {
		System.out.println("상품명 : " + productName + " / 가격 :"+productPrice);
	}




	public void insertProduct(String productName ,int productPrice) {
		this.productName=productName;
		this.productPrice=productPrice;
	}

	


	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public int getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}



	public String[] getProduct() {
		return product;
	}



	public void setProduct(String[] product) {
		this.product = product;
	}
		

	
	
}
