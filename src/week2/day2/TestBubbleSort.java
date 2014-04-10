package week2.day2;

public class TestBubbleSort {

	public static void main(String[] args) {
		int[] mas = {123,22,10,-56,232,1223,45};//create array 
		// and link with mas reference
		
		BubbleSort.sort(mas); //pass reference of array
		
		System.out.println("Sorted mas");
		for(int i = 0; i < mas.length; i++){
			System.out.print(mas[i] + " ");
		}
	}

}
