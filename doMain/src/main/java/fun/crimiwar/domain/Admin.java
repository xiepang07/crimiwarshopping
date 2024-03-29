package fun.crimiwar.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("admin")
public class Admin {


    @TableId(type = IdType.ASSIGN_UUID)
    private String id;//id

    private String name;//姓名

    @TableField(select = false)
    private String password;//密码

    private Integer level;//权限等级

    private String type;//职别

    private String token;//密令

    private Integer work;//工作量

    private Integer logcount = 0;//登录剩余次数

    private Boolean Signed;//是否登录

    private String img;//头像文件

    private String workspace_id;//工作空间id


    public Admin(String name,String password,Integer level,String type,String img,String workspace_id){
        this.name = name;
        this.password = password;
        this.level = level;
        this.type = type;
        this.img = img;
        this.workspace_id = workspace_id;
    }
}
