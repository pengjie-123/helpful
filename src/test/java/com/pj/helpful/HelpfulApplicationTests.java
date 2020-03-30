package com.pj.helpful;

import com.pj.helpful.mapper.ContractInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelpfulApplicationTests {
    @Autowired
    private ContractInfoMapper mapper;

    @Test
    public void contextLoads() {
        mapper.selectByPrimaryKey("138606977155596288");
    }

    @Test
    public void ss() {
//        File f = new File(this.getClass().getResource("/").getPath());
//        f = new File(this.getClass().getResource("").getPath());
//        System.out.println(f);
//        String aa=this.getClass().getClassLoader().getResource("test.properties").toString();
//        System.out.println(aa);
        String rootPath=getClass().getResource("/").getPath();
        String rootPath2=getClass().getResource("").getPath();
        System.out.println(rootPath);
        System.out.println(rootPath2);
    }
}