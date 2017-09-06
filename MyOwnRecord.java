package practice;
class StudentRecord
{
	private double mathGrade;
	private double scienceGrade;
	public double getMathGrade() {
		return mathGrade;
	}
	public void setMathGrade(double mathGrade) {
		this.mathGrade = mathGrade;
	}
	public double getScienceGrade() {
		return scienceGrade;
	}
	public void setScienceGrade(double scienceGrade) {
		this.scienceGrade = scienceGrade;
	}
	
}
class Student
{
	StudentRecord s;
	
	private int studentId;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private static int studentCount;
	Student()
	{
		studentCount+=1;
	}
	public StudentRecord getS() {
		return s;
	}
	public void setS(StudentRecord s) {
		this.s = s;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public static int getStudentCount() {
		return studentCount;
	}
	
	
}
public class MyOwnRecord {
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.setStudentId(15321);
		s1.setName("raju");
		Student s2=new Student();
		s2.setStudentId(153231);
		s2.setName("karthik");
		Student s3=new Student();
		s3.setStudentId(15421);
		s3.setName("pavan");
		System.out.println(Student.getStudentCount());
		

		

		
	}

}
