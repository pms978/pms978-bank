package studio.aroundhub.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import studio.aroundhub.application.data.dto.ProductDTO;
import studio.aroundhub.application.service.ProductService;

@RestController
@RequestMapping("/api/v1/product-api")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService  productService){
        this.productService = productService;
    }

    @GetMapping(value="/product/{productId}")
    public ProductDTO getProduct(@PathVariable String productId){
        return productService.getProduct(productId);
    }

    @PostMapping(value = "/product")
    public ProductDTO createProduct(@RequestBody ProductDTO productDto) {

        String productId = productDto.getProductId();
        String productName =  productDto.getProductName();
        int productPrice = productDto.getProductPrice();
        int productStock = productDto.getProductStock();

        return productService.saveProduct(productId, productName, productPrice, productStock);
   }

   @DeleteMapping(value = "/product/{productId}")
    public ProductDTO deleteProduct(@PathVariable Stirng productId) {return null;}
}
