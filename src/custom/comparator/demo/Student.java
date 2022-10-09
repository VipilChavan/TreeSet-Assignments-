package custom.comparator.demo;

import java.util.Objects;

public class Student implements Comparable{

	int roll_no;
	String name;
	
	
	
	public Student(int roll_no,String name) {
		this.roll_no=roll_no;
		this.name=name;
	}
 
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(name, roll_no);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && roll_no == other.roll_no;
	}

   @Override
    public int compareTo(Object o) {
	   Student s = (Student) o;

		if(this.roll_no < s.roll_no)
			return -1;

		else if(this.roll_no > s.roll_no)
			return 1;

		else 
			return 0;
	 
	
	
} 
	
	
	
	
	
	
	
}
