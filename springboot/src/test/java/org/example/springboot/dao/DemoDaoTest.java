package org.example.springboot.dao;

import org.example.springboot.entity.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

/**
 * @author shallowinggg
 * @date 2020/7/14
 */
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DemoDaoTest {

    @Autowired
    DemoDao demoDao;

    @Test
    public void testGetUser() {
        User user = demoDao.getUser("1");
    }
}
