package edu.jzxy.cbq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.jzxy.cbq.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Cola0817
 * @name UserMapper
 * @date 2023/9/15 21:06
 * @since 1.0.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
