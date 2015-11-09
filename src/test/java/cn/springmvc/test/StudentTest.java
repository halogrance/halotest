package cn.springmvc.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springmvc.model.Student;
import cn.springmvc.service.StudentService;
import cn.springmvc.service.impl.StudentServiceImpl;

public class StudentTest {
	private StudentService studentService;
@Before
public void before(){
	@SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml"});
	studentService=(StudentServiceImpl)context.getBean("StudentServiceImpl");
}
@Test
public void addStu(){
	Student stu=new Student();
	stu.setStuName("nama");
	studentService.insertStu(stu);
}
@Test
public void deleteStu(){
	studentService.deleteStu(1);
}
@Test
public void updateStu(){
	Student stu=new Student();
	//long类型是时间戳，直接new date().gettime可以获取
	stu.setCreateAt(new Date().getTime());
	stu.setStuName("nama");
	studentService.updateStu(stu);
}
@Test
public void selectAllStu(){
	Student stu=studentService.selectAll();
	System.out.println(stu.getStuName());
}
}
