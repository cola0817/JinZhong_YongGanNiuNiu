package edu.jzxy.cbq.byMapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.jzxy.cbq.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Cola0817
 * @name UserMapper
 * @date 2023/9/15 22:45
 * @since 1.0.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
