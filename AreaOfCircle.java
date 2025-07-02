package module1programs;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		double pivalue=Math.PI;
		double r=Math.random();
		System.out.println("radius is :"+r);
		
		double area=pivalue*r*r;
		System.out.println("area is:"+area);
		
		for(int i=1;i<=50;i++)
		{
			System.out.println(area);
		}
		
				

	}

}
