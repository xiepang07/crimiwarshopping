package fun.crimiwar.api.IService;

import com.baomidou.mybatisplus.extension.service.IService;
import fun.crimiwar.domain.Admin;


public interface IAdminService extends IService<Admin> {

    public Boolean Login(String name,String pwd,String token);

    public  Boolean LogFail(String name);
}
