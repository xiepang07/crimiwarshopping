package fun.crimiwar.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.crimiwar.api.IService.IAdminService;
import fun.crimiwar.api.dao.AdminMP;
import fun.crimiwar.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.io.UnsupportedEncodingException;

import static net.sf.jsqlparser.parser.feature.Feature.select;


@Service
public class AdminServiceImp extends ServiceImpl<AdminMP, Admin> implements IAdminService {

    @Autowired
    AdminMP adminMP;

    /**
     *
     * @param name 用户名
     * @param pwd 密码
     * @param token 密令
     * @return 以参数传入数据在数据库中查找是否存在该admin
     */
    @Override
    public Boolean Login(String name, String pwd, String token) {
        String md5="";
        try {
            md5 = DigestUtils.md5DigestAsHex(pwd.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        LambdaQueryWrapper<Admin> lqw = new LambdaQueryWrapper<Admin>();
        lqw.eq(Admin::getName,name).eq(Admin::getPassword,md5);

        /************************************************************************/


        /**
         * 应当先获取当前admin剩余登录次数
         */




        /***************************************************************************/
        if(adminMP.selectCount(lqw)==1){
            //存在该用户名与密码的admin
            lqw.eq(Admin::getToken,token);
            if(adminMP.selectCount(lqw)==1){//检验密令是否正确

                return true;//若成功找到，则返回true

            }else{
                /**
                 * 密令错误
                 */
                LambdaQueryWrapper<Admin> lqw2 = new LambdaQueryWrapper<>();
                lqw2.eq(Admin::getName,name).eq(Admin::getPassword,md5);
                LambdaQueryWrapper<Admin> lqw3 = lqw2.select(Admin::getLogcount);

                Admin admin = adminMP.selectOne(lqw3);//获取只存储登录次数的Admin对象

                int count;
                if((count = admin.getLogcount())>0){//获取仅剩的登录次数
                    admin.setLogcount(--count);
                }
                adminMP.update(admin,lqw2);
                return false;
            }
        }else{
            return false;
        }



    }

    @Override
    public Boolean LogFail(String name) {
        LambdaQueryWrapper<Admin> lqw = new LambdaQueryWrapper<Admin>();
        lqw.eq(Admin::getName,name).select(Admin::getLogcount);
        System.out.println(adminMP.selectOne(lqw));
        return false;
    }
}
