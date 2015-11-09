package cn.springmvc.dao;

import cn.springmvc.model.Student;

public interface StudentDAO {
public int insertStu(Student stu);
public int updateStu(Student stu);
public int deleteStu(int id);
public Student selectAll();
}
