package fun.crimiwar.controller;


import fun.crimiwar.api.feign.AdminGoodsFeign;
import fun.crimiwar.api.feign.UserGoodsFeign;
import fun.crimiwar.util.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/good")
public class GoodsController implements UserGoodsFeign, AdminGoodsFeign {



    @RequestMapping("/goods")
    public R goods(){
        return new R("sss");
    }

    @RequestMapping("/ugoods")
    public R ugoods() {
        return new R("ppp");
    }
}
