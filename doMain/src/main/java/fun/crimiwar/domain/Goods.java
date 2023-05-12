package fun.crimiwar.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * 商品基础类，存储基本信息
 *
 */


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("goods")
public class Goods {

    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    private String name;

    private Long nowquantity;

    private Long lastquantity;

    private Double price;

    private String type;

    @TableLogic(value = "0",delval = "1")
    private Integer deleted;


}
