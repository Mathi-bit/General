package programk;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[]= {1,2,4,66,3,5,6,7,9,88,77,55,44};
		
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-i-1;j++) {
			
			if(arr[j]>arr[j+1]) {
				
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
				System.out.println("main");
			}
			
		}
			}
		
		
		System.out.println(Arrays.toString(arr));
		
	}

}
