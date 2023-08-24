package fun.crimiwar.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.ArrayList;
import java.util.List;

@TableName("workspace")
public class WorkSpace {

    @TableId(type = IdType.ASSIGN_UUID)
    private String id;//工作区域编号

    @TableField(select = false)
    private String province;//省
    @TableField(select = false)
    private String city;//市


    private String location;//省+市

    private String address;//具体地址

    @TableField(select = false)
    private List<Admin> admins;//工作人员表

    @TableField(select = false)
    private List<Goods> goods;//存储物

    @TableField(select = false)
    private List<Order> orders;//交易单

    @TableField(select = false)
    private List<Work> works;//任务清单

}
