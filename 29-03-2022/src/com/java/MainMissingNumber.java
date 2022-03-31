package com.java;

public class MainMissingNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int s,n=6,ars=0;
		s=n*(n+1)/2;
		for(int i=0;i<a.length;i++) {
			ars=ars+a[i];
		}
		int mn=s-ars;
		System.out.println("Missing number "+mn);

	}

}
