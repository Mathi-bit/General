package programk;

import java.util.Scanner;

public class Fibanaci {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the range:");
		
		int range=sc.nextInt();
		
		
		int n1=0,n2=0;
		
		int n3=1;
		
		for(int i=0;i<range;i++) {
			
		
		if(range>0) {
			
			System.out.print(n3 + " ");
			n1=n2;
			n2=n3;
			n3=n1+n2;
			
		}}
		
		sc.close();
		
	}

}
