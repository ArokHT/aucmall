package scu.huangtao.aucmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"scu.huangtao.aucmall.mapper"})
public class AucmallApplication {

    public static void main(String[] args) {
        SpringApplication.run(AucmallApplication.class, args);
    }

}
