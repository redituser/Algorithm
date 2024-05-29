package sort;

import java.util.Iterator;

public class Selection {
	public static void main(String[] args) {
		int [] arr = {20,13, 15, 65,44,21};
		
		int min;
		
		for(int i = 0; i < arr.length-1; i++) {
			min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[min] > arr[j] ) {
					min = j;
			}
				
				
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	
	
	
	}
	

	

} 
