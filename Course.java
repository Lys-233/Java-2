package lys;

public class Course {
	
	public Course(){
		
	}

	public Course(String courseId,String courseName,String address,String time,String teacherId,String teacherName){
		this.courseId=courseId;
		this.courseName=courseName;
		this.address=address;
		this.time=time;
		this.teacherName=teacherName;
		this.teacherId=teacherId;
	}
	
	
	private String courseId;

	private String courseName;

	private String address;

	private String time;

	private String teacherId;

	private String teacherName;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

}