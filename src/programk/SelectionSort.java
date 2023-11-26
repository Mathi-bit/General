package programk;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

int a[]= {1,3,2,5,4,7,6,9,8};

int n=a.length;


for(int i=0;i<n-1;i++) {
	
	int min=i;
	
	
	for(int j=i+1;j<n;j++) {
		if(a[j]<a[min]) {
			min=j;
			
		}
	}
	
	
	int temp=a[i];
	a[i]=a[min];
	a[min]=temp;
	
	
}

		System.out.println(Arrays.toString(a));
		
		
	}

}
