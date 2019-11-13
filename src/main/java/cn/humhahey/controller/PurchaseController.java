package cn.humhahey.controller;

import cn.humhahey.pojo.Product;
import cn.humhahey.service.ProductService;
import cn.humhahey.service.PurchaseService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @Autowired
    private ProductService productService;

    @PostMapping("/purchase")
    public Result purchase(int id, int userId, int quantity) {
        boolean success=purchaseService.purchase(id, userId, quantity);
        String message=success?"抢购成功":"抢购失败";
        return new Result(success, message);
    }
    @PostMapping("/add")
    public Product add(Product product) {
        productService.insertProduct(product);
        return product;
    }
    @Data
    @AllArgsConstructor
    class Result {
        private boolean success;
        private String message;
    }
}

