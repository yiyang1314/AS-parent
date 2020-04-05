package com.server.shop.excel.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentUtils {
	
	
	static String [] grades= {"大一","大二","大三","大四"};
	static String []names= {"劉毅","王二","張思","李凡"};
	
	public static  List<Student> getStudents() {
		   List<Student> list=	new ArrayList<Student>();
		   Student s=null;
		   Random r=new Random();
	    	for (int i = 0; i < 15; i++) {
				s=new Student(names[r.nextInt(4)],2015+2*i,r.nextInt(99)%2==0?"男":"女","北方民族大学", "123456", grades[r.nextInt(4)]);
			list.add(s);
	    	}
	     return list;
	    }
  
  
     public static Student add() {
    	 		Random r=new Random();
				return new Student("李四"+r.nextInt(15),2015+2*r.nextInt(4),r.nextInt(99)%2==0?"男":"女","", "123456", "大一");
	    }
}
