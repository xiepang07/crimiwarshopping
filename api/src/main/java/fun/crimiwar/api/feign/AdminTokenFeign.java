package fun.crimiwar.api.feign;


import fun.crimiwar.api.feign.hystrix.AdminTokenFeignHystrix;
import fun.crimiwar.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "token-service",fallback = AdminTokenFeignHystrix.class)
public interface AdminTokenFeign {

    @GetMapping("/token")
    public R demo();

}
