package cn.humhahey.pojo;

import cn.humhahey.conditional.DatabaseConditional;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@Conditional(DatabaseConditional.class)
public class DatabaseProperties {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    public static void main(String[] args) {

    }
}
