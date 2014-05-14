package week7.day1.struct;

public class StudentForHash {
	
	private String name;
	
	private int age;
	
	private double money;
	
	private int idNum;
	
	private boolean isBest;
	
	private long lNum;

	public StudentForHash(String name, int age, double money, int idNum) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
		this.idNum = idNum;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (int) (lNum ^ (lNum >>> 32));
		long temp;
		temp = Double.doubleToLongBits(money);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentForHash other = (StudentForHash) obj;
		if (age != other.age)
			return false;
		if (lNum != other.lNum)
			return false;
		if (Double.doubleToLongBits(money) != Double
				.doubleToLongBits(other.money))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}






	@Override
	public String toString() {
		return "StudentForHash [name=" + name + ", age=" + age + ", money="
				+ money + ", idNum=" + idNum + ", isBest=" + isBest + "]";
	}
	
	
}
