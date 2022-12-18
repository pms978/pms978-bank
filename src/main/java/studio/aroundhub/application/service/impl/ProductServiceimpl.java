package studio.aroundhub.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import studio.aroundhub.application.data.dto.ProductDTO;
import studio.aroundhub.application.service.ProductService;

public class ProductServiceimpl implements ProductService {
    @Autowired
    ProductDataHandler productDataHandler;

    public ProductServiceimpl(ProductDataHandler productDataHandler) {
        this.productDataHandler = productDataHandler;
    }
    @Override
    public ProductDTO saveProduct(String productId, String productName, int productPrice, int productStock) {
        ProductEntyty productEntyty = productDataHandler.saveProductEntity
        return null;
    }

    @Override
    public ProductDTO getProduct(String productId) {
        return null;
    }
}
