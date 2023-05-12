package fun.crimiwar.api.feign.hystrix;

import fun.crimiwar.api.feign.AdminTokenFeign;
import fun.crimiwar.util.R;
import org.springframework.stereotype.Component;


@Component
public class AdminTokenFeignHystrix implements AdminTokenFeign {
    @Override
    public R demo() {
        return new R("aaasdsada");
    }
}
