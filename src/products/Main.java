package products;

public class Main {

	public static void main(String[] args) {
	Product test = new Product();
	
	test.vara = "Iphone";
	test.antalILager = 10;
	test.pris = 100;
	
	test.printInfo();
	test.handlaVaror(3);
	test.hamtaAntalILager();
	}
	

}
