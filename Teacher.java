package lys;

public class Teacher extends Person {

	public Teacher(){
		
	}
	
	public Teacher(String id,String name, String sex, Integer age) {
		super( id,name, sex, age);
	}

	private String courseNo;// 课程编号

	private String courseName;// 课程名称

	private String educational;// 学历

	private String professional;// 职称

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

	public String getEducational() {
		return educational;
	}

	public void setEducational(String educational) {
		this.educational = educational;
	}

	public String getProfessional() {
		return professional;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}
	
	
	
	

}