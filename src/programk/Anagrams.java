package programk;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string 1:");
		
		String s1=sc.nextLine();
		
		System.out.println("Enter the String 2:");
		
		String s2=sc.nextLine();
		
		
		s1.replace(" ", "");
		s2.replace(" ", "");
		
		s1.toLowerCase();
		s2.toLowerCase();
		
		
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		boolean result=Arrays.equals(a, b);
		
		if(result==true) {
			System.out.println("It is a Anagram");
		}else {
			System.out.println("It is Not anagram");
		}
		
		sc.close();
		
	}

}
