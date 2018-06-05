package com.packet;

public class Rectangle {
double length;
double width;
double breadth;
double height;

public Rectangle(double length,double breadth){
	if(length>0.0&&length<20.0&&breadth>0.0&&breadth<20.0)
	{
		this.length=length;
		this .breadth=breadth;
	}
	else{
		System.out.println("sorry length should be greater than 0.0 && less than 20.0 ");
	}
}
public double findperimeterOfRectangle(){
	this.breadth=breadth;
	this.height=height;
	return 2*(breadth+height);
	
}
public double findAreaOfRectangle(){
	return length*breadth;
	
}
public double getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
private double less(double d) {
	// TODO Auto-generated method stub
	return 0;
}
public int getWidth() {
	return (int) width;
}
public void setWidth(int width) {
	this.width = width;
	
}
public double getBreadth() {
	return breadth;
}
public void setBreadth(double breadth) {
	this.breadth = breadth;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public static void main(String[]args){
	Rectangle r=new Rectangle(10,15);
	System.out.println(r.findAreaOfRectangle());
	
}
}