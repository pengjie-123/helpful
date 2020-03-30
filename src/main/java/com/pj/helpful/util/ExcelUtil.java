package com.pj.helpful.util;

import org.apache.poi.hssf.usermodel.*;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExcelUtil {


    public static void exportExcel(HttpServletResponse response){
        //1实例化
        HSSFWorkbook workbook=new HSSFWorkbook();
        //创建哟个excel表单
        HSSFSheet sheet=workbook.createSheet("sheet");
        //设置表头
        HSSFCellStyle cellStyle=workbook.createCellStyle();

       // setTitle(workbook, sheet, data.getHead());
        //设置单元格并赋值
        //setData(sheet, data.getData());
        //设置浏览器下载
        //setBrowser(response, workbook, data.getFileName());
        HSSFRow row=sheet.createRow(0);
        HSSFCell cell;
        cell=row.createCell(0);
        cell.setCellValue("学号");
        row.createCell(1).setCellValue("姓名");
        row.createCell(2).setCellValue("年龄");
        row.createCell(3).setCellValue("性别");
        List<Person> ps=new ArrayList<>();
        Person p1=new Person(1,"xiaw",12,"boy");
        Person p2=new Person(1,"xiaw2",13,"boy");
        Person p3=new Person(1,"xiaw3",12,"girl");
        Person p4=new Person(1,"xiaw4",11,"boy");
        Person p5=new Person(1,"xiaw5",12,"boy");
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);
        ps.add(p4);
        ps.add(p5);

        for(int i=0;i<ps.size();i++){
            row=sheet.createRow(i+1);

            row.createCell(0).setCellValue(ps.get(i).getId());
            row.createCell(1).setCellValue(ps.get(i).getName());
            row.createCell(2).setCellValue(ps.get(i).getAge());
            row.createCell(3).setCellValue(ps.get(i).getGender());
        }
        Date date=new Date();
        SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");
        String fname=sf.format(date);
        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition","attachment;filename="+fname+".xls");

        try {
           // OutputStream out=new FileOutputStream(new File("D:\\test.xls"));
            response.flushBuffer();

            workbook.write(response.getOutputStream());
            //workbook.close();
//            out.flush();
//            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        HttpServletResponse response=null;
        exportExcel(response);
    }
}
