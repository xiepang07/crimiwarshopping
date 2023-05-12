package fun.crimiwar.api.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import fun.crimiwar.domain.Goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMP extends BaseMapper<Goods> {
}
