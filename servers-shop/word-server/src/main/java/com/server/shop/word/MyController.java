package com.server.shop.word;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("demo")
public class MyController {

    @RequestMapping("export")
    public void export(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> params = new HashMap<>();
        params.put("title","这是标题");
        params.put("name","李四");
        //这里是我说的一行代码
        WordUtils.exportWord("word/export.docx","F:/test","aaa.docx",params,request,response);
    }
}
