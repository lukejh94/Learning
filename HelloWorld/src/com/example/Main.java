package com.example;

public class Main {

	public static void main(String[] args) {
		String hello = "Hello World";
		System.out.println(hello);
		hello = "goodbye";
		
		char[] hump= {'a','r','e'};
		String blue=new String(hump);
		System.out.println(blue);
		
		char[] lego= {'s','u','c','k','s'};
		lego[0]='f';
		String oblong=new String(lego);
		System.out.println(oblong);
		
	weather();
		age();
	
	}
		public static void age() {
			weather();
		String w = "I am ";
		int x = 28;
		String y = " years old";
		System.out.println(w+x+y);
	 }
	
	public static void weather() {
		String todaysWeather = "Hello ";
		//finds your name
		todaysWeather = todaysWeather+"Luke. ";
		//find the weather
		todaysWeather = todaysWeather+"It will be sunny. ";
		
		
		System.out.println(todaysWeather);
	}

}
