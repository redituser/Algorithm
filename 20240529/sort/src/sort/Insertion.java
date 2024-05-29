package sort;

import java.util.ArrayList;
import java.util.List;

public class Insertion {
	public static void main(String[] args) {
		
		  List<Integer> list = new ArrayList<>();
	        list.add(10);
	        list.add(67);
	        list.add(32);
	        list.add(5);
	        list.add(16);

	    
		for(int i = 1; i < list.size(); i++) {
			int j = i-1;
			int current = list.get(i);
			
			while(j >=0 && list.get(j) > current) {
				list.set(j+1, list.get(j));
				j--;
			}
			
			list.set(j+1 , current);
			
			
		}
		
		for (int num : list) {
			System.out.print(num + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		 int k = 0;
//		 int temp;
//		for (int i = k+1; i < arr.length; i++) {
//			for (int j = 0; j < i; j++) {
//				if(arr[i] < arr[j]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");               
//		}
//		
//		int[] arr = {67 , 10 , 32 ,5 ,16};	
//		
//		for (int i = 1; i < arr.length; i++) {
//			int key = arr[i];
//			int j = i-1;
//		
//		
//		
//		while(j >= 0 && arr[j] > key) {
//			 arr[j + 1] = arr[j];
//			 j = j-1;
//		}
//		arr[j + 1 ] = key;
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
	}

}
