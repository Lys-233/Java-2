# 计G201 刘芸杉 2020322058

# Java-2
Java课程作业项目仓库

# 实验目的
1.掌握面向对象的类设计方法  
2.掌握类的继承用法，通过构造方法实例化对象  
3.使用super（），用于实例化子类  
4.掌握使用Object根类的toString（）方法  
5.初步了解分析系统需求，了解系统中的实体及其关系，学会定义类中的属性及其方法  

# 实验过程
·创建Course,Person,Student,Teacher,SchoolMain类，其中SchoolMain为主测试类，Person为父类，Teacher和Student为子类  
·Course类中设置courseId,courseName,address,time,teacherId,teacherName属性；设置set,get方法赋值与取值；定义了course的有参和无参的构造方法  
·Person类中设置了编号，姓名，性别，年龄，证件类型，证件号码，联系电话，联系地址属性；设置set,get方法；定义无参，有参构造方法  
·Student类中设置了belongGrade，belongClass，课程编号，课程名称属性；设置set,get方法；定义无参，有参构造方法；使用了super（）继承Person实例化了学生  
·Teacher类中设置了课程编号，课程名称，学历，职称属性；设置set,get方法；定义无参，有参构造方法；使用了super（）实例化了老师  
·SchoolMain主测试类中创建对象；使用了多对象组成容器list将各类属性放到一起  

# 核心方法
1.Student和Teacher类中的Super（）  
2.无参和有参的构造方法  

# 实验结果
输入对应学生序号显示出可选课程的列表，输入课程对应序号，显示出当前学生的选课信息。  
