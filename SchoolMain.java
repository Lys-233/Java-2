package lys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolMain {
	
	public static void main(String[] args){

		List<Teacher> teacherList=initTeacher();
		System.out.println("���,��ʦ��� ,��ʦ����,�Ա�,����");
		for(int i=0;i<teacherList.size();i++){
			Teacher teacher=teacherList.get(i);
			System.out.println((i+1)+","+teacher.getId()+","+teacher.getName()+","+teacher.getSex()+","+teacher.getAge().toString());
		}
		
		List<Student> stuList=initStudent();
		System.out.println("���,ѧ����� ,ѧ������,�Ա�,����");
		for(int i=0;i<stuList.size();i++){
			Student stu=stuList.get(i);
			System.out.println((i+1)+","+stu.getId()+","+stu.getName()+","+stu.getSex()+","+stu.getAge().toString());
		}
		
		System.out.println("������ѡ��ѧ����Ӧ�����:");
		Scanner stuSc=new Scanner(System.in);
		int stIndex=stuSc.nextInt();
		Student stu=stuList.get(stIndex-1);
		
		List<Course> list=initCoure();
		System.out.println("���,�γ̱�� ,�γ�����,��ʦ���,��ʦ����,�Ͽ�ʱ��  ,�Ͽεص�");
		for(int i=0;i<list.size();i++){
			Course c=list.get(i);
			System.out.println((i+1)+","+c.getCourseId()+","+c.getCourseName()+","+c.getTeacherId()+","+c.getTeacherName()+","+c.getTime()+","+c.getAddress());
		}
		System.out.println("������ѡ��γ̶�Ӧ�����:");
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		
		Course c=new Course();
		c=list.get(index-1);
		
		stu.setCourseName(c.getCourseName());
		stu.setCourseNo(c.getCourseId());
		
		System.out.println("��ǰѧ����Ϣ:���"+stu.getId()+",����:"+stu.getName()+",�Ա�:"+stu.getSex()+",����:"+stu.getAge());
		System.out.println("ѧ��ѡ��γ�:�γ̱��"+stu.getCourseNo()+",�γ�����:"+stu.getCourseName());
		
		
		System.out.println("�Ƿ��˳��ÿγ�:y/n?");
		Scanner flag=new Scanner(System.in);
		String fIndex=flag.next();
		if("y".equals(fIndex)){
			stu.setCourseName(null);
			stu.setCourseNo(null);
		}
		System.out.println("��ǰѧ����Ϣ:���"+stu.getId()+",����:"+stu.getName()+",�Ա�:"+stu.getSex()+",����:"+stu.getAge());
		System.out.println("ѧ��ѡ��γ�:�γ̱��"+stu.getCourseNo()+",�γ�����:"+stu.getCourseName());
		
		
		System.out.println("���,�γ̱�� ,�γ�����,��ʦ���,��ʦ����,�Ͽ�ʱ��  ,�Ͽεص�");
		for(int i=0;i<list.size();i++){
			c=list.get(i);
			System.out.println((i+1)+","+c.getCourseId()+","+c.getCourseName()+","+c.getTeacherId()+","+c.getTeacherName()+","+c.getTime()+","+c.getAddress());
		}
		
		
		
		
		

		
	}
	

	public static List<Student> initStudent(){
		
		List<Student> stuList=new ArrayList<>();
		Student stu=new Student("1000","����","��",20);
		stuList.add(stu);
		
		Student stu2=new Student("1001","����","��",19);
		stuList.add(stu2);
		
		Student stu3=new Student("1002","����","Ů",18);
		stuList.add(stu3);
		
		return stuList;
	}
	
	
public static List<Teacher> initTeacher(){
		
		List<Teacher> teaList=new ArrayList<>();
		Teacher teacher=new Teacher("2000","����ʦ","��",40);
		teaList.add(teacher);
		
		Teacher teacher2=new Teacher("2001","����ʦ","��",45);
		teaList.add(teacher2);
		
		Teacher teacher3=new Teacher("3002","����ʦ","Ů",46);
		teaList.add(teacher3);
		
		return teaList;
	}
	
	
	
	public static List<Course> initCoure(){
		
		List<Course> courseList=new ArrayList<>();
		
		Course course=new Course("001","����","��һ��ѧ¥501","2020-10-29 10:00:00","����ʦ","2000");
		courseList.add(course);
		
		Course course1=new Course("002","��ѧ","��һ��ѧ¥503","2020-10-29 14:00:00","����ʦ","2001");
		courseList.add(course1);
		
		
		Course course2=new Course("003","Ӣ��","��һ��ѧ¥504","2020-10-29 16:00:00","����ʦ","2002");
		courseList.add(course2);
		
		
		return courseList;
		
		
	}
}
