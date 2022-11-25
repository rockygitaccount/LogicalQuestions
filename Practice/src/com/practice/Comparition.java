package com.practice;

public class Comparition {
public static void main(String[] args) {
	String s1 = new String("xyz");
	String s2 = new String("xyz");
System.out.println(s1==s2); //false because
                              //object address is different
System.out.println(s1.equals(s2)); //equals
                               //compares the values. True.
}}
