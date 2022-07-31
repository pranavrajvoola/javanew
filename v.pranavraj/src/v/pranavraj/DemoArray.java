package v.pranavraj;

import java.util.Scanner;

public class DemoArray {
	public static void main(String[] args) {
		//to take input from keyboard we use
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		//define the array
		int a[]=new int[size];
		//how to read array inputs dynamically
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the value at index "+i);
			a[i]=sc.nextInt();
		}
		
		//how to display the array details
		//model 1 by using for
		System.out.println("using for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		System.out.println("by for eachloop");
		//model 2
		//for each loop
		for(int data:a) {
			System.out.println(data);
		}
	}

}
