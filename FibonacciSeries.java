package week1.day1;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int max=40;
		int sum=0;
		int fn=0;
		int sn=1;
		
		System.out.println("Fibonacci series:");
		System.out.println(fn);
		System.out.println(sn);
		
		for (int i=1;(sum+fn)<max ; i++)
		{
			sum = fn+sn;
			System.out.println(sum);
			fn=sn;
			sn=sum;
			
		}
			
	}   
}
