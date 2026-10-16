package com.oops.inheritancepractice01;

class Products{
	String name;
	int price;
	String status;
	/**
	 * @param name
	 * @param price
	 * @param status
	 */
	public Products(String name, int price, String status) {
		super();
		this.name = name;
		this.price = price;
		this.status = status;
	}
	
public void getProduct() {
	
	System.out.println(name);
	System.out.println(price);
	System.out.println(status);
}
}

 class ElectronicProducts extends Products{
	boolean iswarrenty;
	int warrentyInYear;
	/**
	 * @param name
	 * @param price
	 * @param status
	 * @param iswarrenty
	 * @param warrentyInYear
	 */
	public ElectronicProducts(String name, int price, String status, boolean iswarrenty, int warrentyInYear) {
		super(name, price, status);
		this.iswarrenty = iswarrenty;
		this.warrentyInYear = warrentyInYear;
	}
	
	
	void showElectronicProducts() {
		
		System.out.println("product name->"+name);
		System.out.println("product price->"+price);
		System.out.println("is available or not->"+status);
		System.out.println("warrenty->"+iswarrenty);
		System.out.println("warrenty timing->"+warrentyInYear);
	
		
	}
	
}
 
 class Books extends Products{
	 String authorName;
	 String type;
	 /**
 	 * @param name
 	 * @param price
 	 * @param status
 	 * @param authorName
 	 * @param type
 	 */
	 public Books(String name, int price, String status, String authorName, String type) {
		super(name, price, status);
		this.authorName = authorName;
		this.type = type;
	 }
	 
	 void showBooks() {
			System.out.println("Book name->"+name);
			System.out.println("Book price->"+price);
			System.out.println("Is book in stock->"+status);
			System.out.println("Book's writter->"+authorName);
			System.out.println("Which type of book is this->"+type);
			
	 }
 }


public class InheritanceWithCtor {

	public static void main(String[] args) {
		
		ElectronicProducts ep=new ElectronicProducts("Bulb",200, "Out of stock", true, 1);
		
		ep.showElectronicProducts();
		
		System.out.println(".............................");
		
		
		Books book=new Books("Still Waiting", 1120, "Available", "vivek Rajput", "Sad");
			
		book.showBooks();
		
	}

}
