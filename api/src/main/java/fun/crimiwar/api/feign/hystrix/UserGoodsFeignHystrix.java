package fun.crimiwar.api.feign.hystrix;


import fun.crimiwar.api.feign.UserGoodsFeign;
import fun.crimiwar.util.R;
import org.springframework.stereotype.Component;

@Component
public class UserGoodsFeignHystrix implements UserGoodsFeign {
    @Override
    public R ugoods() {
        return new R("ttt");
    }
}
