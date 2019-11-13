package cn.humhahey.convert;

import cn.humhahey.pojo.SexEnum;
import cn.humhahey.pojo.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToUserConvert implements Converter<String, User> {

    @Override
    public User convert(String source) {
        String[] strings = source.split("-");
        User user = new User();
        user.setId(Long.parseLong(strings[0]));
        user.setUsername(strings[1]);
        user.setNote(strings[2]);
        user.setSex(SexEnum.getEnumById(Integer.parseInt(strings[3])));
        return user;
    }
}
