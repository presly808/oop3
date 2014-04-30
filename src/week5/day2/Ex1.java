package week5.day2;

public class Ex1 {

	public static void main(String[] args) {
		//Composition
		Com com = new Com();
		com = null;
		
		// Agregation
		Dir d = new Dir();
		Com c = new Com();
		c.dir = d;
		c = null;
	}
	
}

class Dir{
	
}

class Com{
	
	Dir dir = new Dir();
	
	
}
