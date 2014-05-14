package week7;

public class BinarySearch {
	
	
	public static int binSearch(int[] mas, int el){
		int start = 0;
		int end = mas.length - 1;
		
		
		while(start <= end){
			
			int mid = start + ((end - start) / 2);
			if(el < mas[mid]){
				end = mid - 1;
			} else if(el > mas[mid]){
				start = mid + 1;
			} else {
				return mid;
			}
			
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] mas = {1,2,3,4,5,6,7,8,10};
		System.out.println(binSearch(mas, -10));
	}
}
