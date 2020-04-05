package com.server.shop.excel.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pig4cloud.plugin.excel.annotation.ResponseExcel;
import com.server.shop.excel.entity.Student;
import com.server.shop.excel.entity.StudentUtils;


@Controller
public class ExcelController {
	
	@ResponseExcel(name="學生",sheet="學生用戶表")
	@GetMapping("/list")
	public List<Student> findAll(){
		List<Student> list=StudentUtils.getStudents();
		return list;
	}

	@GetMapping("/findAll")
	@ResponseBody
	public List<Student> findAll1(){
		List<Student> list=StudentUtils.getStudents();
		return list;
	}
	
	@ResponseExcel(name="加密保護",sheet="學生用戶表2",password="123456")
	@GetMapping("/findpwd")
	public List<Student> findpwd(){
		List<Student> list=StudentUtils.getStudents();
		return list;
	}
	
	@ResponseExcel(name="模板生成",sheet="學生用戶表3",template="example.xlsx")
	@GetMapping("/temp")
	public List<Student> temp(){
		List<Student> list=StudentUtils.getStudents();
		return list;
	}
	
	
}
