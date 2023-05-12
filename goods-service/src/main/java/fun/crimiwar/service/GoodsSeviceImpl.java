package fun.crimiwar.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.crimiwar.api.IService.IGoodsService;
import fun.crimiwar.api.dao.GoodsMP;
import fun.crimiwar.domain.Goods;
import org.springframework.stereotype.Service;

/***
 *
 * 物资service的实现类
 *
 */
@Service
public class GoodsSeviceImpl extends ServiceImpl<GoodsMP, Goods> implements IGoodsService {
}
