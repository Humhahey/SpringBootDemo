package cn.humhahey.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PurchaseRecord implements Serializable {
    private static final Long serialVersionUID = 2L;
    private int id;
    private int userId;
    private int productId;
    private double price;
    private int quantity;
    private double sum;
    private Date purchaseDate;
    private String note;



}
