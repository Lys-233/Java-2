package lys;

public class Teacher extends Person {

	public Teacher(){
		
	}
	
	public Teacher(String id,String name, String sex, Integer age) {
		super( id,name, sex, age);
	}

	private String courseNo;// �γ̱��

	private String courseName;// �γ�����

	private String educational;// ѧ��

	private String professional;// ְ��

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