package week5.day2.strategy.sort;

public class BubbleSort implements ISort {

	@Override
	public void sort(Comparable[] mas) {
			for(int i = 0; i < mas.length; i++){
				
				for(int j = 0; j < mas.length - 1; j++){
					if(mas[j].compareTo(mas[j+1]) > 0){
						swap(mas, j, j+1);
					}
				}
				
			}
	}
	
	public static void swap(Comparable[] mas, int index1, int index2){
		Comparable temp = mas[index1];
		mas[index1] = mas[index2];
		mas[index2] = temp;
	}

}
