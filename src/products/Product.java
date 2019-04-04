package products;

public class Product {
	
	public String vara;
	public int antalILager;
	public double pris;
	
	public int hamtaAntalILager(){
		return antalILager;
		}
	
	public void handlaVaror(int antal){
		antalILager = antalILager - antal;
		}
	
public void printInfo() {
	double totalPris = antalILager * pris;
	System.out.println("Vara: " + vara);
	System.out.println("Antal i lager: " + antalILager);
	System.out.println("Pris: " + pris);
	System.out.println(totalPris);
}
}
