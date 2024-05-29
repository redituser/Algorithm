package sort;

public class practice {
	 public static void main(String[] args) {
	        // 정렬할 배열 선언
	        int[] array = {5, 2, 4, 6, 1, 3};

	        // 정렬 전 배열 출력
	        System.out.println("Before sorting:");
	        printArray(array);

	        // 삽입 정렬 수행
	        insertionSort(array);

	        // 정렬 후 배열 출력
	        System.out.println("After sorting:");
	        printArray(array);
	    }
		
	
	
	
	 public static void printArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	 
	 
	 public static void insertionSort(int[] array) {
	        // 배열의 두 번째 요소부터 시작
	        for (int i = 1; i < array.length; i++) {
	            // 현재 요소를 temp에 저장
	            int temp = array[i];
	            int j = i - 1;

	            // 정렬된 부분의 요소들과 비교하여 적절한 위치를 찾음
	            while (j >= 0 && array[j] > temp) {
	                // 요소를 한 칸씩 오른쪽으로 이동
	                array[j + 1] = array[j];
	                j--;
	            }
	            // temp를 올바른 위치에 삽입
	            array[j+1] = temp;
	        }
	    }
	 

}
