package fun.crimiwar.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import fun.crimiwar.domain.Admin;
import fun.crimiwar.api.IService.IAdminService;
import fun.crimiwar.api.feign.AdminGoodsFeign;
import fun.crimiwar.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class AdminServiceController {

    @Resource
    AdminGoodsFeign adminGoodsFeign;

    @Autowired
    IAdminService adminService;

    @RequestMapping("admin")
    public R admin(){
        R r = adminGoodsFeign.goods();
        return r;
    }

    @PutMapping("logfail/{name}")
    public R LogFail(@PathVariable String name){

        return new R(false);
    }

    @GetMapping("test")
    public R test(){
        String name = "xiepang";
        adminService.LogFail(name);
        return new R(false);
    }



    @PostMapping("log")
    public R logIn(@RequestParam(value = "password") String password,
                   @RequestParam(value = "name") String name,
                   @RequestParam(value = "token") String token)
    {
        if (adminService.Login(name,password,token)){
            return new R(true);
        }else{
            LogFail(name);
            return new R(false);
        }
    }

}
