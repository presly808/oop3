package week5.day2.strategy.sort;

import java.util.Arrays;
import java.util.Scanner;

public class TestSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SelectionSort selectionSort = new SelectionSort();
		BubbleSort bubbleSort = new BubbleSort();
		Sorter sorter = new Sorter(bubbleSort);
		
		Integer[] mas = null;
		
		loop1: while(true){
			mas = genRanMas(10);
			System.out.println("NEW MAS");
			System.out.println(Arrays.toString(mas));
			System.out.println("Choose sorting algorithm");
			System.out.println("1. Bubble");
			System.out.println("2. Selection");
			System.out.println("3. Exit");
			int num = sc.nextInt();
			
			
			switch(num){
			
				case 1 : 
					sorter.changeSortAlg(bubbleSort);
					sorter.sort(mas);
					break;
					
				case 2 : 
					sorter.changeSortAlg(selectionSort);
					sorter.sort(mas);
					break;
					
				case 3:
					break loop1;
			
			}
			
			System.out.println("Sorted");
			System.out.println(Arrays.toString(mas));
			
			
		}

	}
	
	public static Integer[] genRanMas(int size){
		Integer[] mas = new Integer[size];
		for(int i = 0; i < mas.length; i++){
			//Autoboxing
			mas[i] = (int)(Math.random() * 100);
		}
		return mas;
	}

}
