package reverseAnArray;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5};
		int n = arr.length;
		int t;
		
		//method 1
		for(int i=0;i<n/2;i++) {
			t = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = t;
		}
		
		//method 2
		Collections.reverse(Arrays.asList(arr));
		
		System.out.println(Arrays.asList(arr));
		
		//method 3 string array String builder 
		 String[] a = {"Hello", "World"}; 
	     StringBuilder reversed = new StringBuilder(); 
	     for (int i = a.length; i > 0; i--) { 
	         reversed.append(a[i - 1]).append(" "); 
	     }; 
	     String[] reversedArray = reversed.toString().split(" ");   
	     System.out.println(Arrays.toString(reversedArray)); 
	}

}
