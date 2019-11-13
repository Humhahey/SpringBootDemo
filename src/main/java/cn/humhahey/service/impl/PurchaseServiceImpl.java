package cn.humhahey.service.impl;

import cn.humhahey.mapper.ProductMapper;
import cn.humhahey.mapper.PurchaseRecordMapper;
import cn.humhahey.pojo.Product;
import cn.humhahey.pojo.PurchaseRecord;
import cn.humhahey.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private PurchaseRecordMapper purchaseRecordMapper;

    @Override
    @Transactional
    public boolean purchase(int id, int userId, int quantity) {
        Product product = productMapper.getProduct(id);
        if (product.getStock() < quantity) {
            return false;
        }
        productMapper.decreaseProduct(id, quantity);
        purchaseRecordMapper.insetPurchaseRecord(this.initPurchaseRecord(userId, product, quantity));
        return true;
    }

    private PurchaseRecord initPurchaseRecord(int userId, Product product, int quantity) {
        PurchaseRecord purchaseRecord = new PurchaseRecord();
        purchaseRecord.setNote("购买日志，时间:"+System.currentTimeMillis());
        purchaseRecord.setPrice(product.getPrice());
        purchaseRecord.setProductId(product.getId());
        purchaseRecord.setQuantity(quantity);
        purchaseRecord.setSum(product.getPrice()*quantity);
        purchaseRecord.setUserId(userId);
        return purchaseRecord;
    }


}
