package fun.crimiwar.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import fun.crimiwar.domain.Admin;
import fun.crimiwar.api.IService.IAdminService;
import fun.crimiwar.api.feign.AdminGoodsFeign;
import fun.crimiwar.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

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



    @PostMapping("addadmin")
    public R addAdmin(
    @RequestParam(value = "adminimg",required = false) MultipartFile file,
    @RequestParam(value = "adminname",required = false) String name,
    @RequestParam(value = "adminworkspace",required = false) String workspace,
    @RequestParam(value = "adminlevel",required = false)Integer level,
    @RequestParam(value = "adminpwd",required = false)String password,
    @RequestParam(value = "admintype",required = false)String type){


        try {
            String imgname = file.getName();
            String pwd = DigestUtils.md5DigestAsHex(password.getBytes("utf-8"));//md5处理密码
            Admin admin = new Admin(name,pwd,level,type,imgname,workspace);



        } catch (UnsupportedEncodingException e) {
            return new R(false);
        }
        return new R(false);
    }

}
