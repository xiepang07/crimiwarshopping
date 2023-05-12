package fun.crimiwar.api.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import fun.crimiwar.domain.Admin;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AdminMP extends BaseMapper<Admin> {
}
