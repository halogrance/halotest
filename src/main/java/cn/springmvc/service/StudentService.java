package cn.springmvc.service;

import cn.springmvc.model.Student;

public interface StudentService {
	public int insertStu(Student stu);
	public int updateStu(Student stu);
	public int deleteStu(int id);
	public Student selectAll();
}
