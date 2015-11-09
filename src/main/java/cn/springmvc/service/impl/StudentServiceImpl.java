package cn.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.StudentDAO;
import cn.springmvc.model.Student;
import cn.springmvc.service.StudentService;
@Service(value="StudentServiceImpl")
public class StudentServiceImpl implements StudentService {
	@Autowired
StudentDAO studentDAO;
	public int insertStu(Student stu) {
		// TODO Auto-generated method stub
		return studentDAO.insertStu(stu);
	}
	public int updateStu(Student stu) {
		// TODO Auto-generated method stub
		return studentDAO.updateStu(stu);
	}
	public int deleteStu(int id) {
		// TODO Auto-generated method stub
		return studentDAO.deleteStu(id);
	}
	public Student selectAll() {
		// TODO Auto-generated method stub
		return studentDAO.selectAll();
	}

}
