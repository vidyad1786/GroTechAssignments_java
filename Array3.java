package module1programs;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the size of array at runtime");
		int[] rollno=new int[s1.nextInt()];
		
		for(int i=0;i<rollno.length;i++) {
			System.out.println("Enter the value of index posion" +i);
		rollno[i]=s1.nextInt();
		}

		
		System.out.println("The output array is:");
		System.out.println(Arrays.toString(rollno));
		s1.close();

	}

}
