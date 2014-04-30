package week5.day2.strategy.sort;

public class Sorter {
	
	private ISort sortAlg;
	
	public Sorter(ISort sortAlg) {
		super();
		this.sortAlg = sortAlg;
	}

	public void sort(Comparable[] mas){
		sortAlg.sort(mas);
	}

	public ISort getSortAlg() {
		return sortAlg;
	}

	public void changeSortAlg(ISort sortAlg) {
		this.sortAlg = sortAlg;
	}
	
}
