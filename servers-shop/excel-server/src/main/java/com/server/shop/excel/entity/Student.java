package com.server.shop.excel.entity;

import java.io.Serializable;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;

import lombok.Data;
@Data
public class Student  implements Serializable{
	
	private static final long serialVersionUID = -6567108093874898531L;
	@ExcelProperty("用戶名")
	@ColumnWidth(20)
	private String username;
	@ExcelProperty("學號")
	private Integer stuno;
	@ExcelProperty("性別")
	private String sex;
	@ExcelProperty("學校")
	private String school;
	@ExcelProperty("密碼")
	private String password;
	@ExcelProperty("年級")
    private String grade;
	public Student(String username, Integer stuno, String sex, String school, String password, String grade) {
		super();
		this.username = username;
		this.stuno = stuno;
		this.sex = sex;
		this.school = school;
		this.password = password;
		this.grade = grade;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
