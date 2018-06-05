package com.packet;

public class Date {
static int month;
static int day;
static int year;
public Date(int month,int day,int year){
this.month=month;
this.day=day;
this.year=year;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public static void main(String[] args){
	Date d1=new Date(month,day,year);
	d1.setMonth(7);
	d1.setDay(23);
	d1.setYear(2018);
	
	System.out.println(month+"/"+day+"/"+year);
}
}
