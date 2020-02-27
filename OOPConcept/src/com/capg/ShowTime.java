package com.capg;

import java.util.Scanner;

public class ShowTime {

	public static void main(String[] args) {
		int a;
		String b,c,d,e;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.next()+in.nextLine();
		c=in.nextLine();
		d=in.nextLine();
		e=in.nextLine();
		Movie f=new Movie(a,b,c,d,e);
		f.MovieDetails();
		System.out.println(f);
	}


}

class Movie{
	private int id;
	private String name;
	private String showdate;
	private String time;
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getShowdate() {
		return showdate;
	}
	public void setShowdate(String showdate) {
		this.showdate=showdate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time=time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status=status;
	}
	
	
	public Movie(int id, String name, String showdate, String time, String status) {
		this.id = id;
		this.name = name;
		this.showdate = showdate;
		this.time = time;
		this.status = status;
	}
	
	public void MovieDetails() {
		System.out.println("ID is "+id);
		System.out.println("Name is "+name);
		System.out.println("ShowDate is "+showdate);
		System.out.println("Time is "+time);
		System.out.println("Status is "+status);
	}
	
//	public String toString() {
//		return "Movie id= "+id
//				+"\nMovie name= "+name
//				+"\nShow time= "+time
//				+"\nShow Date= "+showdate
//				+"\nstatus= "+status;
//	}
}
	
	

