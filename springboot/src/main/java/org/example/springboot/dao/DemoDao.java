package org.example.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.springboot.entity.User;

/**
 * @author shallowinggg
 * @date 2020/7/14
 */
@Mapper
public interface DemoDao {

    /**
     * Find {@link User} from table 'user' by id.
     *
     * @param id query condition
     * @return User
     */
    @Select("select id, name from user where id = #{id}")
    User getUser(@Param("id") String id);
}
