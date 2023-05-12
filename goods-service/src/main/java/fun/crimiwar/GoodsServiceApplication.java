package fun.crimiwar;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@MapperScan("fun.crimiwar.api.dao")
@EnableCaching
public class GoodsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsServiceApplication.class,args);
    }
}
