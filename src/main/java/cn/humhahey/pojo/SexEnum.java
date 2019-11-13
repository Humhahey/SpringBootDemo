package cn.humhahey.pojo;

import lombok.Getter;

@Getter
public enum SexEnum {
    female(0, "女"), male(1, "男");

    private int id;

    private String sex;

    SexEnum(int id, String sex) {
        this.id = id;
        this.sex = sex;
    }

    public static SexEnum getEnumById(int id) {
        return id==female.getId() ? female : male;
    }
}
