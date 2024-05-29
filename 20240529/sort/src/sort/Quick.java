package sort;

import java.util.Arrays;

public class Quick {
		
	 public static void main(String[] args) {
	        // 정렬할 배열
	        int[] arr = {30, 20, 70, 10, 40, 80, 50, 60, 90};

	        // 정렬 전 배열 출력
	        System.out.println("Before Sorting:");
	        display(arr);

	        // 퀵 정렬 실행
	        quickSort(arr, 0, arr.length - 1);

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

	    // 퀵 정렬 함수
	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            // 배열을 분할하고 피벗의 인덱스를 반환받음
	            int pi = partition(arr, low, high);

	            // 피벗 기준으로 좌측 부분 배열을 재귀적으로 정렬
	            quickSort(arr, low, pi - 1);
	            // 피벗 기준으로 우측 부분 배열을 재귀적으로 정렬
	            quickSort(arr, pi, high);
	        }
	    }

	    // 배열을 분할하는 함수
	    public static int partition(int[] arr, int low, int high) {
	        // 피벗을 배열의 중간 요소로 설정
	        int pivot = arr[(low + high) / 2];
	        int i = low;
	        int j = high;
	        int temp;

	        // i와 j가 교차할 때까지 반복
	        while (i <= j) {
	            // i는 피벗보다 큰 요소를 찾을 때까지 증가
	            while (arr[i] < pivot) {
	                i++;
	            }
	            // j는 피벗보다 작은 요소를 찾을 때까지 감소
	            while (arr[j] > pivot) {
	                j--;
	            }
	            // i와 j가 교차하지 않았다면 두 요소를 교환
	            if (i <= j) {
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	                i++;
	                j--;
	            }
	        }

	        // 다음 분할의 기준이 되는 인덱스를 반환
	        return i;
	    }
	}