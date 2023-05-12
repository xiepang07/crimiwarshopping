package fun.crimiwar.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("admin_token")
public class Token {

    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(select = false)
    private String content;//token内容

    private String date;//记录当前token适用时期

    private String typename;//每一类权限级别对应不同的token

    private Integer deleted;

}
