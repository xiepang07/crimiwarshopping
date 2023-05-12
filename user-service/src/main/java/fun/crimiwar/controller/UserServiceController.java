package fun.crimiwar.controller;


import fun.crimiwar.api.feign.UserGoodsFeign;
import fun.crimiwar.util.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserServiceController {

    @Resource
    UserGoodsFeign userGoodsFeign;

    @GetMapping("user")
    public R user(){
        R r = userGoodsFeign.ugoods();
        return r;
    }

}
