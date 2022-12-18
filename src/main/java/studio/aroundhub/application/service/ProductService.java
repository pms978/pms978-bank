package studio.aroundhub.application.service;

import studio.aroundhub.application.data.dto.ProductDTO;

public interface ProductService {

    ProductDTO saveProduct(String productId, String productName, int productPrice, int productStock);
    ProductDTO getProduct(String productId);
}
