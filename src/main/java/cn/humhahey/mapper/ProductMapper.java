package cn.humhahey.mapper;

import cn.humhahey.pojo.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    public Product getProduct(int id);

    public int decreaseProduct(@Param("id") int id, @Param("quantity") int quantity);

    public int insertProduct(Product product);
}
