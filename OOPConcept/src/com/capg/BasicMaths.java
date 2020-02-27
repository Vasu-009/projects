package com.capg;

public class BasicMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle smallRectangle=new Rectangle(5,4);
		Rectangle bigRectangle=new Rectangle(14,12);
		smallRectangle.findArea();
		smallRectangle.findPerimeter();
		bigRectangle.findArea();
		bigRectangle.findPerimeter();
	}
}


class Rectangle{

	private int len,bre;
	public Rectangle(int l,int b) {
		len=l;
		bre=b;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getBre() {
		return bre;
	}
	public void setBre(int bre) {
		this.bre = bre;
	}
	public void findArea() {
		int area=len*bre;
		System.out.println("Area="+area);
	}
	public void findPerimeter() {
		int perimeter=2*(len+bre);
		System.out.println("Perimeter="+perimeter);
	}
}
