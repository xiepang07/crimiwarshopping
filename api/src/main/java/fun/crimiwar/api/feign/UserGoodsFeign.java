package fun.crimiwar.api.feign;


import fun.crimiwar.api.feign.hystrix.UserGoodsFeignHystrix;
import fun.crimiwar.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 *用户与物资间的远程调用
 *
 */
@FeignClient(value = "goods-service",fallback = UserGoodsFeignHystrix.class)
public interface UserGoodsFeign {

    @RequestMapping("/ugoods")
    public R ugoods();

}
