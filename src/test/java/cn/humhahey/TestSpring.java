package cn.humhahey;

import cn.humhahey.config.MybatisConfig;
import cn.humhahey.mapper.UserMapper;
import cn.humhahey.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@MybatisTest
@ContextConfiguration(classes = {MybatisConfig.class})
public class TestSpring {

    @Autowired(required = false)
    UserMapper userMapper;

    @Test
    public void test() {
        User user = userMapper.getUser(1L);
    }

}
