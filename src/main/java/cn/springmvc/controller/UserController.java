package cn.springmvc.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.springmvc.model.Student;
import cn.springmvc.service.impl.StudentServiceImpl;

@Controller
@RequestMapping("/")
public class UserController {

	@RequestMapping("index2")
	public String index(){
		return "index2";
	}
	@Autowired
	StudentServiceImpl studentServiceImpl;
	@RequestMapping(value="/serch",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView serchStu(HttpServletResponse response) throws IOException{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Student/serch");
		Student stu=studentServiceImpl.selectAll();
		mav.addObject("stu", stu);
//		JSONArray json = JSONArray.fromObject(map);
//		return json;
		return mav;
		
	}
}

