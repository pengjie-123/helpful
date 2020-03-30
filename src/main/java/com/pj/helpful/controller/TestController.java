package com.pj.helpful.controller;

import com.pj.helpful.bean.ContractInfo;
import com.pj.helpful.mapper.ContractInfoMapper;
import com.pj.helpful.service.IContraService;
import com.pj.helpful.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

@Controller
public class TestController {

   @Autowired
    private IContraService service;

    @ResponseBody
    @RequestMapping("/get")
    public ContractInfo selectOne(){
        return service.findByPrimaryKey("138606977155596288");
    }
    @RequestMapping("/download")
    public void download(HttpServletResponse response){
        ExcelUtil.exportExcel(response);
    }
    @RequestMapping("/path")
    public void getPATH(HttpServletRequest request){
       String realpath=request.getServletContext().getRealPath(File.separator);
        System.out.println(realpath);
        realpath=request.getSession().getServletContext().getRealPath(File.separator);
        System.out.println(realpath);
//        WebApplicationContext context= ContextLoader.getCurrentWebApplicationContext();
//        realpath=context.getServletContext().getRealPath(File.separator);
//        System.out.println(realpath);
        File f=new File(this.getClass().getClassLoader().getResource("/").getPath());
     System.out.println(f);
    }
}
