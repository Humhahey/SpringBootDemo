package cn.humhahey.pojo;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String note;
    private SexEnum sex;
}
