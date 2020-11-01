package lys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolMain {
	
	public static void main(String[] args){

		List<Teacher> teacherList=initTeacher();
		System.out.println("序号,教师编号 ,教师名称,性别,年龄");
		for(int i=0;i<teacherList.size();i++){
			Teacher teacher=teacherList.get(i);
			System.out.println((i+1)+","+teacher.getId()+","+teacher.getName()+","+teacher.getSex()+","+teacher.getAge().toString());
		}
		
		List<Student> stuList=initStudent();
		System.out.println("序号,学生编号 ,学生名称,性别,年龄");
		for(int i=0;i<stuList.size();i++){
			Student stu=stuList.get(i);
			System.out.println((i+1)+","+stu.getId()+","+stu.getName()+","+stu.getSex()+","+stu.getAge().toString());
		}
		
		System.out.println("请输入选择学生对应的序号:");
		Scanner stuSc=new Scanner(System.in);
		int stIndex=stuSc.nextInt();
		Student stu=stuList.get(stIndex-1);
		
		List<Course> list=initCoure();
		System.out.println("序号,课程编号 ,课程名称,教师编号,教师名称,上课时间  ,上课地点");
		for(int i=0;i<list.size();i++){
			Course c=list.get(i);
			System.out.println((i+1)+","+c.getCourseId()+","+c.getCourseName()+","+c.getTeacherId()+","+c.getTeacherName()+","+c.getTime()+","+c.getAddress());
		}
		System.out.println("请输入选择课程对应的序号:");
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		
		Course c=new Course();
		c=list.get(index-1);
		
		stu.setCourseName(c.getCourseName());
		stu.setCourseNo(c.getCourseId());
		
		System.out.println("当前学生信息:编号"+stu.getId()+",姓名:"+stu.getName()+",性别:"+stu.getSex()+",年龄:"+stu.getAge());
		System.out.println("学生选择课程:课程编号"+stu.getCourseNo()+",课程名称:"+stu.getCourseName());
		
		
		System.out.println("是否退出该课程:y/n?");
		Scanner flag=new Scanner(System.in);
		String fIndex=flag.next();
		if("y".equals(fIndex)){
			stu.setCourseName(null);
			stu.setCourseNo(null);
		}
		System.out.println("当前学生信息:编号"+stu.getId()+",姓名:"+stu.getName()+",性别:"+stu.getSex()+",年龄:"+stu.getAge());
		System.out.println("学生选择课程:课程编号"+stu.getCourseNo()+",课程名称:"+stu.getCourseName());
		
		
		System.out.println("序号,课程编号 ,课程名称,教师编号,教师名称,上课时间  ,上课地点");
		for(int i=0;i<list.size();i++){
			c=list.get(i);
			System.out.println((i+1)+","+c.getCourseId()+","+c.getCourseName()+","+c.getTeacherId()+","+c.getTeacherName()+","+c.getTime()+","+c.getAddress());
		}
		
		
		
		
		

		
	}
	

	public static List<Student> initStudent(){
		
		List<Student> stuList=new ArrayList<>();
		Student stu=new Student("1000","张三","男",20);
		stuList.add(stu);
		
		Student stu2=new Student("1001","李四","男",19);
		stuList.add(stu2);
		
		Student stu3=new Student("1002","王五","女",18);
		stuList.add(stu3);
		
		return stuList;
	}
	
	
public static List<Teacher> initTeacher(){
		
		List<Teacher> teaList=new ArrayList<>();
		Teacher teacher=new Teacher("2000","李老师","男",40);
		teaList.add(teacher);
		
		Teacher teacher2=new Teacher("2001","张老师","男",45);
		teaList.add(teacher2);
		
		Teacher teacher3=new Teacher("3002","王老师","女",46);
		teaList.add(teacher3);
		
		return teaList;
	}
	
	
	
	public static List<Course> initCoure(){
		
		List<Course> courseList=new ArrayList<>();
		
		Course course=new Course("001","语文","第一教学楼501","2020-10-29 10:00:00","李老师","2000");
		courseList.add(course);
		
		Course course1=new Course("002","数学","第一教学楼503","2020-10-29 14:00:00","张老师","2001");
		courseList.add(course1);
		
		
		Course course2=new Course("003","英语","第一教学楼504","2020-10-29 16:00:00","王老师","2002");
		courseList.add(course2);
		
		
		return courseList;
		
		
	}
}
