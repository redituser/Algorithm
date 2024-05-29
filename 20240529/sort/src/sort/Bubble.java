package sort;

import java.util.Arrays;

public class Bubble {
public static void main(String[] args) {

	int [] array = {10 , 67 , 32 ,5 , 16};
	int temp = 0;
	
	
	for (int i = 0; i < array.length-1; i++) {
		for (int j = 0; j < array.length-1; j++) {
			if(array[j] > array[j+1]) {
				temp = array[j];
				array[j] =array[j+1];
				array[j+1] = temp;
			}
		}
	}
	
       System.out.println(Arrays.toString(array));
}


	
	
}
