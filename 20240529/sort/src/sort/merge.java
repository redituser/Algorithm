package sort;

public class merge {
	 public static void main(String[] args) {
	        // 정렬할 배열
	        int[] arr = {30, 20, 70, 10, 40, 80, 50, 60, 90};

	        // 정렬 전 배열 출력
	        System.out.println("Before Sorting:");
	        display(arr);

	        // 병합 정렬 실행
	        mergeSort(arr, 0, arr.length - 1);

	        // 정렬 후 배열 출력
	        System.out.println("After Sorting:");
	        display(arr);
	    }

	    // 배열을 출력하는 함수
	    public static void display(int[] arr) {
	        for (int value : arr) {
	            System.out.printf("%5d", value);
	        }
	        System.out.println();
	    }

	    // 병합 정렬 함수
	    public static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            // 배열의 중간 인덱스를 계산
	            int middle = (left + right) / 2;

	            // 왼쪽 부분 배열을 재귀적으로 정렬
	            mergeSort(arr, left, middle);
	            // 오른쪽 부분 배열을 재귀적으로 정렬
	            mergeSort(arr, middle + 1, right);

	            // 두 부분 배열을 병합
	            merge(arr, left, middle, right);
	        }
	    }

	    // 두 부분 배열을 병합하는 함수
	    public static void merge(int[] arr, int left, int middle, int right) {
	        // 두 부분 배열의 크기를 계산
	        int n1 = middle - left + 1;
	        int n2 = right - middle;

	        // 두 부분 배열을 저장할 임시 배열 생성
	        int[] L = new int[n1];
	        int[] R = new int[n2];

	        // 원래 배열의 값을 임시 배열에 복사
	        for (int i = 0; i < n1; ++i) {
	            L[i] = arr[left + i];
	        }
	        for (int j = 0; j < n2; ++j) {
	            R[j] = arr[middle + 1 + j];
	        }

	        // 임시 배열의 첫 번째 인덱스
	        int i = 0, j = 0;

	        // 병합할 배열의 첫 번째 인덱스
	        int k = left;

	        // 두 배열의 값을 비교하면서 병합
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            } else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }

	        // 남아 있는 요소들을 병합
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
}
