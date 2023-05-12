package fun.crimiwar.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.crimiwar.api.IService.IUserService;
import fun.crimiwar.api.dao.UserMP;
import fun.crimiwar.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMP, User> implements IUserService {
}
