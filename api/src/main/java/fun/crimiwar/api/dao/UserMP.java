package fun.crimiwar.api.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import fun.crimiwar.domain.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMP extends BaseMapper<User> {
}
