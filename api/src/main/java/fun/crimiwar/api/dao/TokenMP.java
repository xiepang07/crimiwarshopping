package fun.crimiwar.api.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import fun.crimiwar.domain.Token;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TokenMP extends BaseMapper<Token> {
}
