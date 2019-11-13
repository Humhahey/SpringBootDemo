package cn.humhahey.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int id;
    private String name;
    private int stock;
    private int version;
    private double price;
    private String note;


}
