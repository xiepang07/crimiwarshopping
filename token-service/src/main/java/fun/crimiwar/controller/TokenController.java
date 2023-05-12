package fun.crimiwar.controller;


import fun.crimiwar.api.feign.AdminTokenFeign;
import fun.crimiwar.util.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController implements AdminTokenFeign{


    @Override
    @GetMapping("/token")
    public R demo() {
        return new R("gygy");
    }//测试服务中心连通

    @GetMapping("/tttt")
    public R demo1(){
        return new R("aaada");
    }
}
