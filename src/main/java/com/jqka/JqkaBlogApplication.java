package com.jqka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName: JqkaBlogApplication <br/>
 * @Description: 启动程序 <br/>
 * @Date: 11:10  2019/5/31 <br/>
 * @Author JQKA_Blog  < zhwh > <br/>
 * @Version 1.0
 * @Since JDK 1.8
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.jqka.project.**.dao")
public class JqkaBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(JqkaBlogApplication.class, args);
    }

}
