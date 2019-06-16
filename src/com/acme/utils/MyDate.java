package com.acme.utils;

import java.lang.Math;

public class MyDate {
	 
	public int day;
	public int year;
	public int month;
	public static int count = 1;
	
	public MyDate() {
		count++;
		this.day = 1;
		this.month = 1;
		this.year = 2000;
		double result = Math.abs(-10);
		System.out.println(result);
	}
	
	public MyDate(int m, int d, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public String toString() {
		return formatDayMonth(this.month) + "/" +  formatDayMonth(this.day) + "/" +  this.year;
	}
	
	public String formatDayMonth(int args) {
		return String.format("%02d", args);
	}
	
	public void setDate(int m, int d, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
}
