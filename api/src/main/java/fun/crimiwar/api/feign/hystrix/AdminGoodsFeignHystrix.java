package fun.crimiwar.api.feign.hystrix;

import fun.crimiwar.api.feign.AdminGoodsFeign;
import fun.crimiwar.util.R;
import org.springframework.stereotype.Component;


@Component
public class AdminGoodsFeignHystrix implements AdminGoodsFeign {
    @Override
    public R goods() {
        return new R("uuu");
    }
}
