package com.test;

import java.io.File;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.server.shop.excel.MyListener;
import com.server.shop.excel.entity.Student;
import com.server.shop.excel.entity.TestFileUtil;



public class TestCase{
	 private static final Logger log = LoggerFactory.getLogger(TestCase.class);
	@Test
	public void contextLoads() {
	}
	
	@Test
    public void simpleRead() {
        // 有个很重要的点 MyListener 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去
        // 写法1：
        String fileName = TestFileUtil.getPath() + File.separator +"學生.xlsx";
        System.out.println(fileName);
        log.debug("-----------------------------simpleRead--------------------------");
        log.debug(fileName);
        List<Student> list=null;
		// 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
   //     EasyExcel.read(fileName, Student.class, new MyListener()).sheet().doRead();
        // 写法2：
        log.debug("-----------------------------simpleRead--------------------------");
		
		  ExcelReader excelReader = EasyExcel.read(fileName, Student.class, new
		  MyListener()).build(); ReadSheet readSheet = EasyExcel.readSheet(0).build();
		  excelReader.read(readSheet); // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
		  excelReader.finish();
		 
    }
}
