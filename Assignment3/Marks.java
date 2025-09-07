class Student{
	private double marks;
	
	public double getMarks(){
		return marks;
	}
	
	public void setMarks(double marks){
		if(0 <= marks && marks <= 100){
			this.marks = marks;
		}
		else{
			System.out.println("Enter correct marks..");
		}
	}
}

public class Marks{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.setMarks(85.23);
		System.out.println("Marks = " +s1.getMarks());
	}
}