
package com.practice;
 public class RemoveDuplicates {
	 
	 public static void main(String[] args) {
		 int x [] = {1,2,2,3,4,5,5,6,7,7,7,8};
		 int temp [] = new int[x.length];
		 int j = 0;
		 for (int i=0; i<x.length-1; i++) {
		 if (x[i] != x[i+1]) {
			 temp[j] = x[i];
			 j++;
		 }
		 }
		 temp[j] = x[x.length-1]; //last no will print
		 for (int m: temp) {
			 System.out.print(m);
		 }
		 }
		 }