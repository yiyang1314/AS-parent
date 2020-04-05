package com.server.shop.excel;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.server.shop.excel.entity.Student;

public class MyListener extends AnalysisEventListener<Student> {

    private static final int BATCH_COUNT = 5;
   private  List<Student> list = new ArrayList<Student>();
	

	public MyListener(List<Student> list) {
		super();
		this.list = list;
	}
	public MyListener() {
		super();

	}
	@Override
	public void invoke(Student data, AnalysisContext context) {
		System.out.println(data);
		list.add(data);
		System.out.println("data---"+data);
	}

	@Override
	public void doAfterAllAnalysed(AnalysisContext context) {
		System.out.println("---------------------------------");
		list.forEach(System.out::println);
		
	}
     
	
}
