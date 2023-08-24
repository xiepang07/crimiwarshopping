package fun.crimiwar;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.Jedis;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@MapperScan("fun.crimiwar.api.dao")
@EnableCaching
public class AdminServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServiceApplication.class,args);
    }

    /**
     * 初始化Jedis
     *
     * @return
     */
    @Bean
    public Jedis getJedis(){
        Jedis jedis = new Jedis("127.0.0.1",3396);
        return jedis;
    }

}
