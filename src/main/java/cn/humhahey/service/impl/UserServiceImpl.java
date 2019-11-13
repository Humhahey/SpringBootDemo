package cn.humhahey.service.impl;

import cn.humhahey.mapper.UserMapper;
import cn.humhahey.pojo.User;
import cn.humhahey.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }

    @Override
    public int insertUser(User user) {
        return 0;
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public int insertUsers(List<User> users) {
        int count = 0;
        for (User user : users) {
            count += userMapper.insertUser(user);
        }
        return count;
    }
}
