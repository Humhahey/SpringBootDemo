package cn.humhahey.mapper;

import cn.humhahey.pojo.User;


public interface UserMapper {
    public User getUser(Long id);

    int insertUser(User user);
}
