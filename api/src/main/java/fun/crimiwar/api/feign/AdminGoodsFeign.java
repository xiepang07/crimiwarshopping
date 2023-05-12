package fun.crimiwar.api.feign;

import fun.crimiwar.api.feign.hystrix.AdminGoodsFeignHystrix;
import fun.crimiwar.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "goods-service",fallback = AdminGoodsFeignHystrix.class)
public interface AdminGoodsFeign {

    @RequestMapping("/goods")
    public R goods();

}
