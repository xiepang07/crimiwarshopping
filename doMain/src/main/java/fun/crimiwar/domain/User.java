package fun.crimiwar.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("user")
public class User {

    @TableId(type = IdType.ASSIGN_UUID)
    private String id;//个人id，采取uuid

    private String name;//个人名称

    private String realname;//真实名称

    private String password;//密码

    private String repassword;//双重密码保障

    private String token;//个人暗号，与id配合唯一查询

    private Integer type;//账号性质组织/个人

    private String address;//地址

    private String org;//组织

    private String email;//邮箱

    @TableLogic(value = "0",delval = "1")
    private Integer deleted;//逻辑删除



}
