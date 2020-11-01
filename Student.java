package lys;

public class Student extends Person {

	public Student(){
		
	}
	
	public Student(String id,String name, String sex, Integer age) {
		super(id,name, sex, age);
	}

	private String belongGrade;

	private String belongClass;

	private String courseNo;// ¿Î³Ì±àºÅ

	private String courseName;// ¿Î³ÌÃû³Æ

	public String getBelongGrade() {
		return belongGrade;
	}

	public void setBelongGrade(String belongGrade) {
		this.belongGrade = belongGrade;
	}

	public String getBelongClass() {
		return belongClass;
	}

	public void setBelongClass(String belongClass) {
		this.belongClass = belongClass;
	}

	public String getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	

}