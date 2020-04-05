package com.server.shop.excel.repository;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.handler.WriteHandler;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExcelRepository {
	String name() default "";
	String password() default "";
	ExcelTypeEnum sufferix() default ExcelTypeEnum.XLSX;
	String [] sheet() default {};
	boolean inMemory() default false;
	String template() default "";
	String [] include() default {};
	String [] exclude() default {};
	
	Class<? extends WriteHandler> [] writeHadler() default {};
	Class<? extends Converter> [] converter()  default {};
}
