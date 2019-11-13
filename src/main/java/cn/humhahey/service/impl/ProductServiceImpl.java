package cn.humhahey.service.impl;

import cn.humhahey.mapper.ProductMapper;
import cn.humhahey.pojo.Product;
import cn.humhahey.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper mapper;
    @Override
    public int insertProduct(Product product) {
        return mapper.insertProduct(product);
    }
}
