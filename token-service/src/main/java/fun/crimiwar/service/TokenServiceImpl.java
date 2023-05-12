package fun.crimiwar.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.crimiwar.api.IService.ITokenService;
import fun.crimiwar.api.dao.TokenMP;
import fun.crimiwar.domain.Token;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl extends ServiceImpl<TokenMP, Token> implements ITokenService {
}
