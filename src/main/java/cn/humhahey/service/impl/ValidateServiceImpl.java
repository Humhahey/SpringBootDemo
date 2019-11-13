package cn.humhahey.service.impl;

import cn.humhahey.pojo.User;
import cn.humhahey.service.ValidateService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ValidateServiceImpl implements ValidateService {
    @Override
    public boolean validate(User user) {
        log.info("inside validate");
        return user!=null;
    }
}
