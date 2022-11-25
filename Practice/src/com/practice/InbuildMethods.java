package com.practice;

final public class InbuildMethods {
public static void main(String[] args) { 
	int i = 20;
	float f = 20.21F; double d = 30000D; boolean b = true;
	char[] c = {'a','b','c'};
	String str = "Prateek UpReTi"; 
	System.out.println(str.startsWith("P"));//true 
	System.out.println(str.endsWith("i"));//true 
	System.out.println(str.startsWith("r"));//false 
	System.out.println(str.endsWith("t"));//false
	String intStr = String.valueOf(i);
	String flootStr = String.valueOf(f);
	String doubleStr = String.valueOf(d);
	String booleanStr = String.valueOf(b);
	String charStr = String.valueOf(c);
	System.out.println(intStr);
	System.out.println(flootStr);
	System.out.println(doubleStr);
	System.out.println(booleanStr);
	System.out.println(charStr);
}}