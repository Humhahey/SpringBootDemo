package cn.humhahey.service;

import cn.humhahey.pojo.User;

import java.util.List;

public interface UserService {
    public User getUser(Long id);

    public int insertUser(User user);

    public int insertUsers(List<User> users);
}
