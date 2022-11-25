package com.practice;

public class Pattern {
public static void main(String[] args) {
int number = 6;
for (int i = 0; i<number; i++) {
for (int j=0; j<number; j++) {
if ((i==0 && j==2) || (i==1 && j==1) || (i==1 && j==2) || (i==1 && j==3) || (i==1 && j==4))
{
System.out.print("1");
}
else if (i==2 && j==0 || i==2 && j==1
|| i==2 && j==2 || i==2 && j==3 || i==2 && j==4|| i==2 && j==5)
{
System.out.print("1");
}else {
System.out.print(" ");
}
}
System.out.println();
}
}}
