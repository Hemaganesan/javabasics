package com.packet;

public class Invoice {
	String pathNumber;
	String partDescription;
	int quantity;
	double price;
	public String getPathNumber() {
		return pathNumber;
	}
	public void setPathNumber(String pathNumber) {
		this.pathNumber = pathNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0){
			this.quantity=0;
		}else{
			this.quantity = quantity;
			
		}
		
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0.0){
			this.price=0.0;
		}else{
		
		this.price = price;
		}
	}
	public double getInvoiceAmount(){
		return quantity*price;
		
	}


public static void main(String[] args){
System.out.println();
}
}