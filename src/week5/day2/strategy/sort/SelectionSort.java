package week5.day2.strategy.sort;

public class SelectionSort implements ISort {

	@Override
	public void sort(Comparable[] mas) {
		for(int i = 0; i < mas.length; i++){
			Comparable min = mas[i];
			int minI = i;
			for(int j = i + 1; j < mas.length; j++){
				if(min.compareTo(mas[j]) > 0) {
					min = mas[j];
					minI = j;
				}
			}
			
			Comparable temp = mas[i];
			mas[i] = min;
			mas[minI] = temp;
			
		}
		
	}

}
