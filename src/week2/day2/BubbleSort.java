package week2.day2;

public class BubbleSort {
	
	//Shift + Alt + R
	public static int[] sort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			
			for(int j = 0; j < arr.length - 1; j++){
				if(arr[j] > arr[j+1]){
					//change elements 
					swap(arr, j, j+1);
				}
			}
			
		}
		return arr;
	}
	
	public static void swap(int[] mas, int index1, int index2){
		int temp = mas[index1];
		mas[index1] = mas[index2];
		mas[index2] = temp;
	}
}
