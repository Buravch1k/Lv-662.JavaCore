package l3;

public class Student {

	private static int count = 0;
	private static int totalSum = 0;
	
	private String name;
	private int rait;
	
	{
		count++;

	}

	public Student(String name, int rait) {
		this.name = name;
		this.rait = rait;
		totalSum = totalSum + rait;
	}

	public Student(String name) {
		this.name = name;

	}

	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRait() {
		return rait;
	}

	public void setRait(int rait) {
		totalSum -= this.rait;
		this.rait = rait;
		totalSum += rait;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rait=" + rait + "]";
	}
	
	public static double avgRait() {
		return ((double)totalSum) / count;
	}
	
	public boolean betterStudent(Student s) {
		return this.rait > s.rait;
	}
	

}


